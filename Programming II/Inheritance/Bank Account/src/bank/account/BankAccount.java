
package bank.account;


public abstract class BankAccount {
    protected double balance;
    private int deposits;
    protected int withdrawals;
    private double interestRate;
    protected double serviceCharges;
    
    public BankAccount(double dinero, double rate) {
        balance = dinero;
        interestRate = rate;
    }
    
    public void deposit(int d) {
        balance += d;
        deposits += 1;
    }
    
    public void withdraw(int w) {
        balance = balance - w;
        withdrawals += 1;
    }
    
    public void calcInterest() {  
        double monthlyRate = interestRate / 12;
        double monthlyInterest = monthlyRate * balance;
        balance += monthlyInterest;
    }
    
    public void monthlyProcess() {       
        
        balance = balance - serviceCharges;
        calcInterest();
        
        withdrawals = 0;
        deposits = 0;
        serviceCharges = 0;
    }
}
