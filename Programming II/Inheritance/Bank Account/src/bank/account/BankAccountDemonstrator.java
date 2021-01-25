package bank.account;
import java.util.Scanner;


public class BankAccountDemonstrator {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        SavingsAccount jimmy = new SavingsAccount(3000, .0045);
        int result;
        
        options();
        result = keyboard.nextInt();
        
        while (result != 5) {
            if (result == 1) {
                System.out.println("Enter an amount");
                int money = keyboard.nextInt();
                jimmy.deposit(money);
            }
        }
        
    }
    
    public static void options() {
        
        System.out.print("Enter your request." + "\n" + "1. Deposit an amount" + "\n" + 
                        "2. Withdraw an amount" + "3. View Monthly Process" + "\n" + 
                        "4. Exit program");
        
    }
    
}
