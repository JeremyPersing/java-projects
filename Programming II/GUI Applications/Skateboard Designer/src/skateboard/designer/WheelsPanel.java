package skateboard.designer;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class WheelsPanel extends JPanel implements ListSelectionListener{
    private JPanel wheelPanel;
    private JList wheels;
    public static int wheelsSelected;
    String[] wheelsArray = { "7.75 inch axle $35", "8 inch axle $40",
        "8.5 inch axle $45"
    };
    
    public WheelsPanel() {
        setBorder(BorderFactory.createTitledBorder("Wheels"));
        
        wheels = new JList(wheelsArray);
        
        add(wheels);
        
        wheels.setVisibleRowCount(2);
        wheels.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        wheels.addListSelectionListener(this);
        
        setLayout(new GridLayout(2,1));
    }
    
    public void valueChanged(ListSelectionEvent e) {
        wheelsSelected = 0;
        
        if (!e.getValueIsAdjusting()) {
            if (!wheels.isSelectionEmpty()) {
            
                if (wheels.isSelectedIndex(0)) {
                    wheelsSelected = 35;
                }
                if (wheels.isSelectedIndex(1)) {
                    wheelsSelected = 40;
                }
                if (wheels.isSelectedIndex(2)) {
                    wheelsSelected = 45;
                }
            }
        }
    }
}
