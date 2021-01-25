package slot.machine.simulation;
import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulation {
    private static String[] options = {"Cherries", "Oranges", "Plums", "Bells", "Melons",
                                "Bars"};
    private static int input;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        do {
        System.out.println("Enter an amount of money");
        int amount = keyboard.nextInt();
        
        Random random = new Random();
        
        
        int rOne = random.nextInt(6);
        int rTwo = random.nextInt(6);
        int rThree = random.nextInt(6);
        
        System.out.println("You recieved: " + "\n" + options[rOne] + "\n" + options[rTwo] + 
                "\n" + options[rThree]);
        
        if (rOne == rTwo || rOne == rThree || rTwo == rThree) {
            System.out.println("Congrats, You made: $" + (amount * 2));
        }
        if (rOne != rTwo && rOne != rThree && rTwo != rThree) {
            System.out.println("Sorry you lost your bet");
        }
        if (rOne == rTwo && rTwo == rThree) {
            System.out.println("Congrats, You won: $" + (amount * 3));
        }
        
        System.out.println("Enter 1 to keep playing." + "\nEnter 2 to exit.");
        input = keyboard.nextInt();
        } while (input <= 1);
    }
    
}
