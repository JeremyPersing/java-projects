/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion.program;

import java.util.Scanner;
/**
 *
 * @author Jeremy
 */
public class ConversionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double meters;

        int input;
        
        System.out.println("Enter an amount of meters: ");
        meters = keyboard.nextDouble();
        
        while (meters < 0) {
            System.out.println("Choose an amount greater than 0.");
            meters = keyboard.nextDouble();
        }     
        
        menu();
        
        System.out.println("Enter your choice: ");
        input = keyboard.nextInt();
        
        while (input != 4) {
            if (input == 1) {
                showKilometers(meters);
            }
            else if (input == 2) {
                showInches(meters);
            }
            else if (input == 3) {
                showFeet(meters);
            }
            else {
                System.out.println("Enter a valid key.");
            }                 
            menu();    
            System.out.println("Enter your choice: ");
            input = keyboard.nextInt();
        }
        System.out.println("Bye!");
    }
    
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        
    }
    
    
    public static void showKilometers(double meters) {
        double kilometers = meters * .001;
        System.out.println(kilometers + " kilometers");
    }
    
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(inches + " inches");
    }
    
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(feet + " feet");
    }

}
