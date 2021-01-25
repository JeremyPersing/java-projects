
package population;

import java.util.Scanner;

public class Population {

    public static void main(String[] args) {
        double organisms;
        double growthRate;
        double days;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many organisms are there?");
        organisms = keyboard.nextInt();
        
        while (organisms < 2) {
            System.out.println("There must be more than 2 organisms. Submit a "
                    + "new value.");
            organisms = keyboard.nextInt();
        }
        
        System.out.println("Enter the daily growth percentage of the organisms: ");
        growthRate = keyboard.nextInt();
        
        while (growthRate < 0) {
            System.out.println("The organisms growth can only increase. Enter "
                    + "a positive number.");
            growthRate = keyboard.nextInt();
        }
        
        growthRate = (growthRate * .01) + 1;
        
        System.out.println("How many days will the population increase for?");
        days = keyboard.nextInt();
        
        while (days < 0) {
            System.out.println("Enter an amount greater than 0: ");
            days = keyboard.nextInt();
        }
        
        System.out.println("Days\t\tOrganisms");
        System.out.println("--------------------------");
        
        for (int i = 0; i <= days; i++) {
            System.out.println(i + "\t\t" + organisms);
            
            organisms = organisms * growthRate;
        }
    }
    
}
