package stringbackwards;
import java.util.Scanner;
/**
 *
 * @author Jeremy
 */
public class StringBackwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = keyboard.nextLine();
        System.out.print("That string backwards is ");
        reverse(str);
    }
    
    public static void reverse(String str) {
        char[] arr = str.toCharArray();
        
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
        
    }
}
