
package twenty.one;

import java.util.Scanner;

public class TwentyOne {

    public static void main(String[] args) {
        int dieSides = 6;
        int valueOne;
        int valueTwo;
        int initial;
        int userTotal = 0;
        String answer;
        int input;
        int computerTotal = 0;

        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the game of Twenty-One. In this game " +
                            "we will be using dice instead of cards. The objective " 
                            + "is beat the computer's total without going over " +
                            "21.");
        System.out.println("Would you like to begin (Y for yes N for no)");
        answer = keyboard.nextLine();
        
        if (answer.equals("n") || answer.equals("N")) {
            System.out.println("How about now?");
            answer = keyboard.nextLine();           
        }
        
        Die dieOne = new Die(dieSides);
        Die dieTwo = new Die(dieSides);
        Die dieThree = new Die(dieSides);
        Die dieFour = new Die(dieSides);
        
       
       if (answer.equals("Y") || answer.equals("y")) {
           valueOne = dieOne.getValue();
           valueTwo = dieTwo.getValue();
           initial = valueOne + valueTwo;
           System.out.println("Your initial roll is: " + initial);

           options();
           input = keyboard.nextInt();
           while (input == 1) {
               dieThree.roll();
               dieFour.roll();
               int cTempTotal = dieThree.getValue() + dieFour.getValue();
               computerTotal += cTempTotal + initial;
               
               dieOne.roll();
               dieTwo.roll();
               int nextRoll = dieOne.getValue() + dieTwo.getValue();
               userTotal += initial + nextRoll;
               System.out.println("Your sum is: " + userTotal);
               options();
               input = keyboard.nextInt();
           }
           System.out.println("Your final total is: " + userTotal);
           System.out.println("The computer's total is: " + computerTotal);
           
           if (userTotal > 21) {
               System.out.println("Bust");
           }
           if (userTotal > computerTotal && userTotal <= 21) {
               System.out.println("You won!");
           }
           if (userTotal == computerTotal && userTotal <= 21 && computerTotal <= 21) {
               System.out.println("Draw");
           }
           if (computerTotal > userTotal && computerTotal <= 21) {
               System.out.println("You lose");
           }
           
       }

        
    }

    public static void options() {
        System.out.println("Enter 1 to roll");
        System.out.println("Enter 2 to stop");   
    }
    
    
}
