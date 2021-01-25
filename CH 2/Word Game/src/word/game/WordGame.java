package word.game;
import java.util.Scanner;


public class WordGame {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        
        System.out.println("Enter your age");
        String age = keyboard.nextLine();
        
        System.out.println("Enter your city's name");
        String city = keyboard.nextLine();
        
        System.out.println("Enter your college");
        String college = keyboard.nextLine();
        
        System.out.println("Enter a profession");
        String profession = keyboard.nextLine();
        
        System.out.println("Enter a type of animal");
        String animal = keyboard.nextLine();
        
        System.out.println("Enter your pet's name");
        String petName = keyboard.nextLine();
        
        System.out.print("There once was a person named " + name + " who lived in " +
                city + ". At the age of " + age + ", " + name + " went to college at " +
                college + ". " + name + " graduated and went to work as a " + profession + ".\n"
                        + "Then, " + name + " adopeted a " + animal + " named " + petName + 
                ". They both lived happily ever after!");
    }
    
}
