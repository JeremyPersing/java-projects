/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.tax;

import javax.swing.JOptionPane;
/**
 *
 * @author Jeremy
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double stateTax;            
        double countyTax;
        String purchase;            // User input for the purchase amount
        double purchaseAmount;      // Amount of the purchase
        double totalSale;           // Total amount including sales tax
        double stateAmount;         // State sales tax amount
        double countyAmount;        // County sales tax amount
        
        
        stateTax = .04;
        countyTax = .02;
        
        purchase = JOptionPane.showInputDialog("What was the amount of your " +
                                                "purchase?");
        
        purchaseAmount = Double.parseDouble(purchase);
        
        stateAmount = stateTax * purchaseAmount;
        countyAmount = countyTax * purchaseAmount;
        totalSale = countyAmount + stateAmount + purchaseAmount;
        
        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Amount of state sales tax: $" + stateAmount);
        System.out.println("Amount of county sales tax : $" + countyAmount);
        System.out.println("Total: $" + totalSale);
        
        
        
        
        
        
        
        
        
    }
    
}
