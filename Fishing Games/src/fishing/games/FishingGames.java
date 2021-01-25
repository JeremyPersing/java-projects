package fishing.games;
import java.util.Scanner;

public class FishingGames {

    
    public static void main(String[] args) {
        int num = 1;
        int totalPoints = 0;
        System.out.println("Welcome to hokkin lips and packin dips: ");
        options();
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();
        while (num != 2) {
            Die newDie = new Die();
            int roll = newDie.rollDie();
            getFish(roll); 
            totalPoints += roll;
            options();
            num = keyboard.nextInt();
        }
        
        System.out.println("\nYou accumulated a total of " + totalPoints + " points.\n" +
                            "\nThe local guru has some words of advice: \n");
        
        endResult(totalPoints);
        System.out.println("\nHope you liked my game :p");
    }
    
    public static void options() {
        System.out.print("Press 1 to cast or press 2 to pack up: ");
    }
    
    public static void getFish(int num) {
        switch (num) {
            case 1:
                System.out.println("Wow! You reeled in a honker");
                break;
            case 2:
                System.out.println("Ha, you pulled a doink!");
                break;
            case 3:
                System.out.println("What the?! You caught a turtle!");
                break;
            case 4:
                System.out.println("This looks like a nice largemouth bass");
                break;
            case 5:
                System.out.println("Not a bad looking rainbow trout right there");
                break;
            case 6:
                System.out.println("Jesus, you caught a 40lb salmon");
                break;
        }   
    }
    
    public static void endResult(int num) {
        if (num < 10) {
            System.out.println("You must master patience young one");
        }
        else if (10 <= num && num < 30) {
            System.out.println("Those are some rookie numbers.");
        }
        else if (30 <= num && num < 69) {
            System.out.println("You've almost made it buddy");
        }
        else if (num == 69) {
            System.out.println("You are a glorious human being. May God reserve a seat for you in heaven!");
        }
        else if (num > 69) {
            System.out.println("You have overstayed your welcome, #%$@ you!");
        }
    }
}
