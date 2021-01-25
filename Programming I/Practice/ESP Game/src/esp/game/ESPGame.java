package esp.game;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {


    public static void main(String[] args) {
        int numberCorrect = 0;
        

        for (int i = 0; i < 10; i++) {
            String guess = getGuess();
            String color = getComputerColor();

                if (guess.equalsIgnoreCase(color)) {
                    numberCorrect += 1;
                }
        }
       System.out.println("You got " + numberCorrect + " correct.");
    
    }

    
    public static String getGuess() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess the color in which the computer will choose. "
                         + "The options are red, blue, green, orange, or yellow. "
                         + "Enter your answer here: ");
        String userGuess = keyboard.nextLine();
        return userGuess;
    }
    
    public static String getComputerColor() {
        int randomNumber;
        Random number = new Random();
        randomNumber = number.nextInt(4) + 1;
        String color = "";
            if (randomNumber == 1) {
                color = "red";
            }
            if (randomNumber == 2) {
                color = "blue";
            }
            if (randomNumber == 3) {
                color = "green";
            }
            if (randomNumber == 4) {
                color = "orange";
            }
            if (randomNumber == 5) {
                color = "yellow";
            }
        System.out.println(color);
        return color;
        }


}
    
    
    

