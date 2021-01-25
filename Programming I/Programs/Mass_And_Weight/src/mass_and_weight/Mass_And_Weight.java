/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mass_and_weight;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;


/**
 *
 * @author Jeremy
 */
public class Mass_And_Weight {

  
    public static void main(String[] args) {
        String massInput;
        double mass;
        double newtons;
        
        massInput = JOptionPane.showInputDialog("Enter the Object's mass in kg");
        
        mass = Double.parseDouble(massInput);
        
        

       
       newtons = mass * 9.8;
       
       DecimalFormat formatter = new DecimalFormat("#, #0.00");
       
       if (newtons > 1000){
           JOptionPane.showMessageDialog(null, "The object is too heavy!");
       }
       
       else if (newtons < 10) {
           JOptionPane.showMessageDialog(null, "The object is too light!");
       }
       
       else {
           JOptionPane.showMessageDialog(null, "That is " + newtons + " newtons.");
       }
       
       System.exit(0);
    }
    
}
