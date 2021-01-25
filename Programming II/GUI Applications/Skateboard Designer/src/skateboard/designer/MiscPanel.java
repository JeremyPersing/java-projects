package skateboard.designer;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class MiscPanel extends JPanel implements ListSelectionListener{
    private JPanel miscPanel;
    private JList misc;
    public static int miscSelected;
    String[] miscArray = {"Grip Tape $10", "Bearings $30",
        "Riser Pads $2", "Nuts & Bolts Kit $3"
    };
    
    public MiscPanel() {
        setBorder(BorderFactory.createTitledBorder("Miscellaneous"));
        
        misc = new JList(miscArray);
        
        add(misc);
        
        misc.setVisibleRowCount(2);
        misc.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        misc.addListSelectionListener(this);
        setLayout(new GridLayout(2,1));
    }
    
    public void valueChanged(ListSelectionEvent e) {
        miscSelected = 0;
        if (!e.getValueIsAdjusting()) {
            
          if (!misc.isSelectionEmpty()) {
              
            if (misc.isSelectedIndex(0)) {
                miscSelected = 10;
            }
            if (misc.isSelectedIndex(1)) {
                miscSelected = 30;
            }
            if (misc.isSelectedIndex(2)) {
                miscSelected = 2;
            }
            if (misc.isSelectedIndex(3)) {
                miscSelected = 3;
            }
          }
        }
    }
}
