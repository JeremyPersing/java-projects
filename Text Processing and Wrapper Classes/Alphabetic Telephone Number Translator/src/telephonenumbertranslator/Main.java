package telephonenumbertranslator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a phone number in the format XXX-XXX-XXXX");
        String number = keyboard.nextLine();
        NumberTranslator newNumber = new NumberTranslator(number);
        System.out.println(newNumber.getNumber());
    }
}
