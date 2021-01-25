/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.prediction;

/**
 *
 * @author Jeremy
 */
public class SalesPrediction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double salesPercentage;
       double grossAmount;
       double totalSales;
       salesPercentage = 0.62;
       grossAmount = 4.6;
       totalSales = salesPercentage * grossAmount;

       System.out.println("The East Coast sales division will generate $" +
               totalSales + " million if the company has $4.6 million in sales this year.");
    }
    
}
