package savingsaccountcalculator;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

import static java.lang.Integer.parseInt;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        DecimalFormat dollar = new DecimalFormat("$#0.00");
        FileReader deposits = new FileReader("C:\\Users\\Jeremy\\Desktop\\Java Projects\\Deposits.txt");
        FileReader withdrawals = new FileReader("C:\\Users\\Jeremy\\Desktop\\Java Projects\\Withdrawals.txt");
        BufferedReader bf = new BufferedReader(deposits);
        BufferedReader bf2 = new BufferedReader(withdrawals);
        SavingsAccount userAccount = new SavingsAccount(500,2.5);

        String deposit;
        String withdrawal;
        double depositTotal = 0;
        double withdrawalTotal = 0;
        while (((deposit = bf.readLine()) != null)) {
            double depositAmount = Double.parseDouble(deposit);
            depositTotal += depositAmount;
        }
        while ((withdrawal = bf2.readLine()) != null) {
            double withdrawalAmount = Double.parseDouble(withdrawal);
            withdrawalTotal += withdrawalAmount;
        }
        userAccount.deposit(depositTotal);
        userAccount.withdrawal(withdrawalTotal);
        double total = userAccount.monthlyInterestYield();
        System.out.println("Ending Balance: " + dollar.format(total) + "\nInterest Earned: " + dollar.format((userAccount.yieldRate())));

    }

     /*Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount that is in your bank account");
        double amount = keyboard.nextDouble();
        System.out.println("Enter the annual interest rate (percentage) for your bank account");

        SavingsAccount userAccount = new SavingsAccount(amount, interestRate);

        System.out.println("Enter the number of months that you've had your bank account");
        int time = keyboard.nextInt();

        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double total = 0;

        for (int i = 0; i < time; i++) {
            System.out.println("How much was deposited in the account for month " + (i + 1));
            double depositAmount = keyboard.nextDouble();
            totalDeposits += depositAmount;
            userAccount.deposit(depositAmount);
            System.out.println("How much was withdrawn from the account for month " + (i + 1));
            double withdrawalAmount = keyboard.nextDouble();
            totalWithdrawals += withdrawalAmount;
            userAccount.withdrawal(withdrawalAmount);
            total = userAccount.monthlyInterestYield();

        }

        double totalInterest = total - amount;

        System.out.println("Ending balance: " + dollar.format(total) + "\nTotal Deposits Amount: " +
                dollar.format(totalDeposits) + "\nTotal Withdrawal Amount: " + dollar.format(totalWithdrawals) +
                "\nTotal Interest Earned: " + dollar.format(totalInterest));*/
}
