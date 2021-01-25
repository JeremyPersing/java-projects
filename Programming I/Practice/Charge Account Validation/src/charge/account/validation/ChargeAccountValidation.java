
package charge.account.validation;

import java.util.Scanner;

public class ChargeAccountValidation {


    public static void main(String[] args) {
        int accountNumber;
        
        Scanner keyboard = new Scanner(System.in);
        
        AccountChecker val = new AccountChecker();
        
        System.out.println("Enter your account number: ");
        accountNumber = keyboard.nextInt();
        
        if (val.isValid(accountNumber)) {
            System.out.println("That is a valid account number.");
        }
        else{
            System.out.println("Sorry, your account number is not valid.");
        }
    }
    
}
