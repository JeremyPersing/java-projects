package random.number.guessing.game;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame {


    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        
        number = randomNumber.nextInt(100) + 1;
        
    
        int numberGuess;
        
        System.out.println("Guess the value of the random number between 1 and"
                            + " 100: ");
        numberGuess = keyboard.nextInt();
        while (numberGuess != number) {
            if (numberGuess < number) {
                System.out.println("Your guess is too low. Enter another value: ");
                numberGuess = keyboard.nextInt();
            }
            if (numberGuess > number) {
                System.out.println("Your guess is too high. Enter another value: ");
                numberGuess = keyboard.nextInt();
            }
        }
        System.out.println("Great job, you guessed correctly!");
    }
    
}
