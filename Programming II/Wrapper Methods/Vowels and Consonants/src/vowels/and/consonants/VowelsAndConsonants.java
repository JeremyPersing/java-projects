package vowels.and.consonants;
import java.util.Scanner;

public class VowelsAndConsonants{
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str = getSentence();

        String response = options();
        
        while(!response.equalsIgnoreCase("e")) {
            
            SentenceData data = new SentenceData();
            int vowelsUsed = data.getVowels(str);
            int consonantsUsed = data.getConsonants(str);
            int both = consonantsUsed + vowelsUsed;
            
            
            if (response.equalsIgnoreCase("a")) {
                System.out.println("Vowels: " + vowelsUsed);
                options();
                response = keyboard.nextLine();
            }
            if (response.equalsIgnoreCase("b")) {
                System.out.println("Consonants: " + consonantsUsed);
                options();
                response = keyboard.nextLine();
            }
            if (response.equalsIgnoreCase("c")) {
                System.out.println("Vowels and Consonants: " + both);
                options();
                response = keyboard.nextLine();
            }
            if (response.equalsIgnoreCase("d")) {
                str = getSentence();
                options();
                response = keyboard.nextLine();
            }
        }
        System.out.println("Bye");
        
    }
    
    public static String getSentence() {
        Scanner keyboard = new Scanner(System.in);
        String sentence; 
        
        System.out.println("Enter a sentence.");
        sentence = keyboard.nextLine();
              
        return sentence;
    }
    
    public static String options() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Press the following letters to execute the command: " + "\n"
                + "a. Count the number of vowels in the string." + "\n" + 
                "b. Count the number of consonants in the string." + "\n" + 
                "c. Count both vowels and consonants in the string." + "\n" + 
                "d. Enter another string." + "\n" + "e. Exit the program."
                );
        
        String response = keyboard.nextLine();
        return response;
    }
}
