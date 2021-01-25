package freezing.and.boiling.points;
import java.util.Scanner;

public class FreezingAndBoilingPoints {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Enter a temperature in degrees Fahrenheit and this "
                + "program will tell you whether or not the following compounds/"
                + "elements are boiling or freezing.");
        System.out.println("Your number here: ");
        number = keyboard.nextInt();
        
        Temperature temp = new Temperature(number);
       
        
        if (temp.isEthylFreezing() == true) {
            System.out.println("Ethyl will freeze.");
        }
        if (temp.isEthylBoiling() == true) {
            System.out.println("Ethyl will boil.");
        }
        if (temp.isOxygenBoiling() == true) {
            System.out.println("Oxygen will boil.");
        }
        if (temp.isOxygenFreezing() == true) {
            System.out.println("Oxygen will freeze.");
        }
        if (temp.isWaterBoiling() == true) {
            System.out.println("Water will boil.");
        }
        if (temp.isWaterFreezing() == true) {
            System.out.println("Water will freeze.");
        }
        else {
            System.out.println("Water, oxygen, and ethyl will neither boil nor "
                    + "freeze at this temperature.");
        } 
        
    }
    
}
