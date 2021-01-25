/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.calculator;

import javax.swing.JOptionPane;


/**
 *
 * @author Jeremy
 */
public class TimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String secondsEntered;
       double seconds;
       double minutes;
       double hours;
       double days;
       
       secondsEntered = JOptionPane.showInputDialog("Enter an amount in seconds");
       
       seconds = Double.parseDouble(secondsEntered);
       
       minutes = 60;
       hours = 3600;
       days = 86400;
       
       if (seconds >= minutes && seconds < hours) 
       {
           JOptionPane.showMessageDialog(null, "That is " + seconds / minutes + 
                                         " minutes.");
       }
       if (seconds >= hours && seconds < days) 
       {
           JOptionPane.showMessageDialog(null, "That is " + seconds / hours + 
                                         " hours.");
       }
       if (seconds >= days) 
       {
           JOptionPane.showMessageDialog(null, "That is " + seconds / days + 
                                         " days.");
       }
       if (seconds < 60)
       {
           JOptionPane.showMessageDialog(null, "That is " + seconds + " seconds.");
       }
       
       System.exit(0);
    }
    
}
