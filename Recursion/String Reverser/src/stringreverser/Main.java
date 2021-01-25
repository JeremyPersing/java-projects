package stringreverser;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = keyboard.nextLine();
        System.out.println(stringReverser(input));
    }

    public static String stringReverser(String str) {

        if (str.isEmpty()) {
            return str;
        }
        return stringReverser(str.substring(1)) + str.charAt(0);




    }
}
