package sum.of.numbers.in.a.string;
import java.util.Scanner;



public class SumOfNumbersInAString {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a series of numbers separated by commas.");
        String input = keyboard.nextLine();
        
        String[] tokens = input.split(",");
        int sum = 0;
        
        for (String token : tokens) {   
            sum += Integer.parseInt(token);
        }
        System.out.println("Sum: " + sum);
        
    }
}
