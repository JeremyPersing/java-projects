package moneymanagement;

public class Main {

    public static void main(String[] args) {
        SavingsAccount jeremy = new SavingsAccount(7000, .02);
        jeremy.withdraw(1500);
        jeremy.withdraw(1200);
        jeremy.withdraw(4400);
        jeremy.withdraw(12);
        System.out.println(jeremy.balance);
    }
}
