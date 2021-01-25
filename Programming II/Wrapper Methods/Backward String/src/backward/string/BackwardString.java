package backward.string;
import java.util.Scanner;
        

public class BackwardString {

    
    
    public static void main(String[] args) {
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string: ");
        input = keyboard.nextLine();  
        System.out.println("This string backwards is: " + toBackwards(input));
    }
   
    public static String toBackwards(String str) {
        String reverse = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
