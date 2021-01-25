package practice;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter String: ");
        input = keyboard.nextLine();
        System.out.println(sentenceCap(input));
    }
    
    
    public static String sentenceCap(String str) {
        int i;
        StringBuilder temp = new StringBuilder(str);
        
        if (temp.length() > 0) {
            temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
        }
        
        i = temp.indexOf(". ");
        while (i != -1) {
            i++;
            
            while (i < temp.length() && temp.charAt(i) == ' ') {
                i++;
                
                temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));
                
                i = temp.indexOf(" ", i);
            }
        }
        return temp.toString();
    }
    
}
    


