package chargeaccountvalidation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your account number");
        int chargeNum = keyboard.nextInt();
        ChargeAccount userAccount = new ChargeAccount(chargeNum);
        if (userAccount.isValidAccountNum() == true) {
            System.out.println("That's a valid account number");
        }
        else {
            System.out.println("That is not a valid account number");
        }
    }
}
