package skateboard.designer;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class TrucksPanel extends JPanel implements ListSelectionListener{
    private JPanel truckPanel;
    private JList trucks;
    public static int trucksSelected;
    String[] trucksArray = {"7.75 inch axle $35", "8 inch axle $40",
        "8.5 inch axle $45"
    };
    
    public TrucksPanel() {
        setBorder(BorderFactory.createTitledBorder("Trucks"));
        
        trucks = new JList(trucksArray);
        
        add(trucks);
        
        trucks.setVisibleRowCount(2);
        trucks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        trucks.addListSelectionListener(this);
        
        setLayout(new GridLayout(3,1));
    }
    
    public void valueChanged(ListSelectionEvent e) {
        trucksSelected = 0;
        if (!e.getValueIsAdjusting()) {
            
            if (!trucks.isSelectionEmpty()) {
                if (trucks.isSelectedIndex(0)) {
                    trucksSelected += 35;
                }
                if (trucks.isSelectedIndex(1)) {
                    trucksSelected += 40;
                }
                if (trucks.isSelectedIndex(2)) {
                    trucksSelected += 45;
                }   
            }
        }
        
        
    }
}
