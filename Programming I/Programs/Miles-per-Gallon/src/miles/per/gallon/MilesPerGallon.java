/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miles.per.gallon;

import javax.swing.JOptionPane;     


/**
 *
 * @author Jeremy
 */
public class MilesPerGallon {

    public static void main(String[] args) {
        double miles;           // Amount of miles the user has driven
        double gallons;         // Gallons user has consumed
        double mpg;             // Miles per gallon
        String milesDriven;     // User input for miles driven
        String gallonsUsed;     // User input for gallons used
        
        milesDriven = JOptionPane.showInputDialog("How many miles have you " +
                                                   "driven?");
        miles = Double.parseDouble(milesDriven);
        
        gallonsUsed = JOptionPane.showInputDialog("How many gallons have you "
                                                  + "used?");
        gallons = Double.parseDouble(gallonsUsed);
        
        mpg = miles / gallons;
        
        JOptionPane.showMessageDialog(null, "You're vehicle gets " + mpg
                                      + " miles per gallon.");
        
        // End of program        
        System.exit(0);
    }
    
}
