package bank.account;


public class SavingsAccount extends BankAccount{
    private boolean status;
    
    public SavingsAccount(double dinero, double rate) {
        super(dinero, rate);
    }
    
    public void withdraw(int amt) {
//      true status: active;  false stutus: inactive
        status = true;
        
        if (balance < 25.00) {
            status = false;
            System.out.println("Sorry your account is inactive.");
        }
        
        while (status = true){
            super.withdraw(amt);
        }
        
    }
    
    public void deposit(int amount) {
        status = false;
        
        double newBalance = balance +  amount;
        if (newBalance > 25) {
            status = true;
        }
        
        while (status = true) {
            super.deposit(amount);
        }
    }
    
    public void monthlyProcess() {
        int total = 0;
        for (int i = 0; i < withdrawals; i++) {
            while (i > 4) {
                total += 1;
            }
        }
        
       serviceCharges += total;
       double newTotal = balance - serviceCharges;
       
       if (newTotal < 25) {
           status = false;
           System.out.println("Sorry your account is inactive.");
       }
       super.monthlyProcess();
        
    }
}
