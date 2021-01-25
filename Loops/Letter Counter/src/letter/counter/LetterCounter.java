package letter.counter;
import java.util.Scanner;

public class LetterCounter {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = keyboard.nextLine();
        char [] userInput = input.toCharArray();
        
        
        System.out.println("Enter a character and the amount of times it appears " +
                           "in the string will be shown");
        
        char letter = keyboard.next().charAt(0);
    
        int appearances = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (letter == userInput[i]) {
                appearances += 1;
            }
        }
        
        System.out.println("The letter " + letter + " appears " + appearances + " times.");
    }
    
}
