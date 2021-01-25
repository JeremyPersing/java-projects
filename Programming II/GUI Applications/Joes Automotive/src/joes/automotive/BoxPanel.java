package joes.automotive;
import javax.swing.*;
import java.awt.*;

public class BoxPanel extends JPanel{
    private JCheckBox oilChange;         //For oil
    private JCheckBox lube;              //For lube job
    private JCheckBox radFlush;          //Flushing radiator
    private JCheckBox trannyFlush;       //Flushing transmission
    private JCheckBox inspection;        //For inspection
    private JCheckBox muffler;           //For muffler replacement
    private JCheckBox tires;             //For tire rotation
    
    public BoxPanel() {
        setLayout(new GridLayout(7, 1));
        
        oilChange = new JCheckBox("Oil Change: $26.00");
        lube = new JCheckBox("Lube Job: $18.00");
        radFlush = new JCheckBox("Radiator Flush: $30.00");
        trannyFlush = new JCheckBox("Transmission Flush: $80.00");
        inspection = new JCheckBox("Inspection: $15.00");
        muffler = new JCheckBox("Muffler Replacement: $100.00");
        tires = new JCheckBox("Tire Rotation: $20.00");

        
        //Setting border
        setBorder(BorderFactory.createTitledBorder("Standard Maintenance"));
        
        //Adding boxes to the panel
        add(oilChange);
        add(lube);
        add(radFlush);
        add(trannyFlush);
        add(inspection);
        add(muffler);
        add(tires);
    }
    
    public double getCost() {
        double cost = 0.0;
        
        if (oilChange.isSelected()) {
            cost += 26.00;
        }
        if (lube.isSelected()) {
            cost += 18.00;
        }
        if (radFlush.isSelected()) {
            cost += 30.00;
        }
        if (trannyFlush.isSelected()) {
            cost += 80.00;
        }
        if (inspection.isSelected()) {
            cost += 15.00;
        }
        if (muffler.isSelected()) {
            cost += 100.00;
        }
        if (tires.isSelected()) {
            cost += 20.00;
        }
        
        return cost; 
    }
    
}
