package wordcounter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String str = keyboard.nextLine();

	    System.out.println("The string: " + str + " has " + wordCounter(str) + " words");
    }

    public static int wordCounter(String str) {
        StringTokenizer stringTokens = new StringTokenizer(str);
        int tokens = stringTokens.countTokens();
        return tokens;
    }
}
