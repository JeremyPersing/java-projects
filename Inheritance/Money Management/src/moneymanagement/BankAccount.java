package moneymanagement;

public abstract class BankAccount {
    protected double balance, annualInterest, serviceCharge;
    protected int withdrawals = 0, deposits = 0;

    public BankAccount(double balance, double annualInterest) {
        this.balance = balance;
        this.annualInterest = annualInterest;
    }

    public void deposit(double amt) {
        balance  += amt;
        deposits++;
    }

    public void withdraw(double amt) {
        balance -= amt;
        withdrawals++;
    }

    public void calcInterest() {
       double monthlyRate = annualInterest / 12;
       balance += (balance * monthlyRate);
    }

    public void monthlyProcess() {
        serviceCharge = 0;
        balance -= serviceCharge;
        calcInterest();
        withdrawals = 0;
        deposits = 0;
        serviceCharge = 0;
    }
}
