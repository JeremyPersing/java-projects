package sentence.capitalizer;
import java.util.Scanner;


public class SentenceCapitalizer {

    
    public static void main(String[] args) {
        String initial;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string of uncapitalized sentences: ");
        initial = keyboard.nextLine();
        System.out.println(toCapital(initial));
    }
    
      
    public static String toCapital(String str) {
        int i; 
        StringBuilder sb = new StringBuilder(str);
        
        if (sb.length() > 0) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }
        
        i = sb.indexOf(". ");
        
        while (i != -1) {
            i++;
            
            while (i < sb.length() && sb.charAt(i) == ' ') {
                i++;       
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                
                i = sb.indexOf(". ", i);
            }
        }
  
        return sb.toString();
    }
    
}

  
