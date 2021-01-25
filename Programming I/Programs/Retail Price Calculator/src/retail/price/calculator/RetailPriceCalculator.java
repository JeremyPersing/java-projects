/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retail.price.calculator;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Jeremy
 */
public class RetailPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double wholeSalePrice;
        double wholeSale;
        double markUp; 
        double finalPrice;
        
        wholeSalePrice = getWholeSale();
        
        markUp = getMarkUp();
        
        finalPrice = calculateRetail(wholeSalePrice, markUp);
        
        DecimalFormat dollar = new DecimalFormat("#, ##0.00");
        
        JOptionPane.showMessageDialog(null, "The final price of the item is "+ 
                                      "$" + dollar.format(finalPrice));
                
        System.exit(0);
                    
    }
    
    public static double getWholeSale() {
        String input;
        double wholeSalePrice;
        
        input = JOptionPane.showInputDialog("What is the wholesale price of " +
                                            "the item?");
        
        wholeSalePrice = Double.parseDouble(input);
       
        return wholeSalePrice;  
    }
    
    public static double getMarkUp() {
        String input;
        double markUpPercentage;
        
        input = JOptionPane.showInputDialog("What is the markup percentage " + 
                                            "of the item?");
        
        markUpPercentage = Double.parseDouble(input);
        
        markUpPercentage *= .01;
        
        return markUpPercentage;
    }
    
    public static double calculateRetail(double wholeSalePrice, double markUp ) 
    {
        double finalPrice; 
        
        finalPrice = (wholeSalePrice * markUp) + wholeSalePrice;
            
        return finalPrice;
    }
    
}
