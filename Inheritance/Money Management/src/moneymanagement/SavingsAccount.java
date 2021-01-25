package moneymanagement;

public class SavingsAccount extends BankAccount {
    protected boolean active = false;

    public SavingsAccount(double balance, double annualInterest) {
        super(balance, annualInterest);
    }

    public void withdraw(double amt) {
        if (balance > 25){
            super.withdraw(amt);
        }
        else {
            System.out.println("You do not have enough money in your account");
        }
    }

    public void deposit(double amt) {
        super.deposit(amt);
        if (balance < 25) {
            active = false;
        }
        else {
            active = true;
        }
    }

    @Override
    public void monthlyProcess() {
        if (withdrawals > 4) {
            serviceCharge = withdrawals - 4;
        }
        super.monthlyProcess();
    }
}
