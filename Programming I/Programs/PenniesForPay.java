 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pennies.pkgfor.pay;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Jeremy
 */
public class PenniesForPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double daysWorked;
        double penniesEarned;
        double dayCount;
        double totalPay;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program will calculate how much money you " +
                            "will make if you earned a penny on your first day ");
        System.out.println("of work and your salary doubles for every additional " +
                            "day that you work.");
        
        System.out.print("How many days did you work?");
        
        daysWorked = keyboard.nextInt();

        
        while (daysWorked < 1) {
            System.out.println("Error: Insert a number greater than or equal " +
                                "to 1.");
            daysWorked = keyboard.nextInt();
        }
        
        
        dayCount = 1;
        penniesEarned = 1;
        totalPay = 0;
        
        System.out.println("Days\t\tAmount(pennies)");
        System.out.println("---------------------------------");
        
        while (dayCount <= daysWorked){
            System.out.println(dayCount + "\t\t" + penniesEarned);
            
            totalPay += penniesEarned;
            dayCount++;
            penniesEarned *= 2;
        }
        
        DecimalFormat dollar = new DecimalFormat("#, ##0.00");
        
        System.out.println("Total Amount: $" + dollar.format(totalPay / 100.0));
        
    }
    
}
