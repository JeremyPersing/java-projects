/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package population;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class Population {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double organisms;
        double percentageIncrease;
        double daysMultiplied;
        double startDay;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many organisms are you starting with?");
        organisms = keyboard.nextInt();
        
        while (organisms < 2) {
            System.out.println("Invalid response. Your number of organisms must " +
                                "be greater than 2.");
            organisms = keyboard.nextInt();
        }
        
        System.out.println("What is the daily population increase (Perentage)?" +
                            " Don't include % sign.");
        percentageIncrease = keyboard.nextInt();
        
        while (percentageIncrease < 0) {
            System.out.println("The population may not decrease. Input a " +
                                "positive number.");
            percentageIncrease = keyboard.nextInt();
        }
        
        System.out.println("What is duration of this increase (in days)?");
        daysMultiplied = keyboard.nextInt();
        
        while (daysMultiplied < 1) {
            System.out.println("The duration must be at least one day.");
            daysMultiplied = keyboard.nextInt();
        }
        
        percentageIncrease *= .001;
        startDay = 1;
        
        
        System.out.println("Day\t\tPopulation");
        System.out.println("-----------------------");
        
        while (startDay <= daysMultiplied) {
            System.out.println(startDay + "\t\t" + organisms);
            
            organisms += organisms * percentageIncrease * daysMultiplied;
            startDay++;
        }
        
        
        
    }
    
}
