package savingsaccountcalculator;

public class SavingsAccount {
    private double cashAmount;
    private double interestRate;

    public SavingsAccount(double cash, double rate) {
        cashAmount = cash;
        interestRate = rate / 100;
    }

    public double withdrawal(double amt) {
        cashAmount -= amt;
        return cashAmount;
    }

    public double deposit(double amt) {
        cashAmount += amt;
        return cashAmount;
    }

    public double yieldRate() {
        return cashAmount * (interestRate / 12);
    }
    public double monthlyInterestYield() {
        double yield = (interestRate / 12) * cashAmount;
        cashAmount += yield;
        return cashAmount;
    }


}
