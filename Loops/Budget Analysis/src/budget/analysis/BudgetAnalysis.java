package budget.analysis;
import java.util.Scanner;


public class BudgetAnalysis {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your total budegeted amount for the month");
        double budget = keyboard.nextDouble();
        
        System.out.println("Enter the total number of expenses that you have");
        int i = keyboard.nextInt();
        double expenses = 0;
        
        for (int j = 0; j < i; j++) {
            System.out.println("Enter the amount of expense " + (j + 1));
            double tally = keyboard.nextDouble();
            
            expenses += tally;
        }
        double outcome = budget - expenses;
        
        if (outcome >= 0) {
            System.out.println("You are under your budget by $" + outcome);
        }
        if (outcome < 0) {
            System.out.println("You are over your budget by $" + (outcome * (-1)));
        }
    }
    
    public static void directions() {
        System.out.println("Enter a 1 if you have expenses");
        System.out.println("Enter a 2 if you no longer have expenses");
    }
    
}
