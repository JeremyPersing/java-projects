
package bank;


public class BankAccount {
    private double balance;
    private double currentBalance;
    
    public BankAccount() {
        balance = 0.0;
    }
    
    
    public BankAccount(BankAccount profile) {
        balance = profile.balance;
    }
    
    public BankAccount(double startingBalance) {
        balance = startingBalance;
    }
    
    public double getBalance() {
        return balance;
    }
}
