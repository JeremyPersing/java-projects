package bank;

public class Bank {


    public static void main(String[] args) {
        BankAccount userOne = new BankAccount(2000);
        BankAccount userTwo = new BankAccount(userOne);
        
        System.out.println("The balance in the first account is $" + 
                            userOne.getBalance());
        System.out.println("The balance in the second account is $" + 
                            userTwo.getBalance());
    }
    
}
