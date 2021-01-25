package lottery.application;
import java.util.Scanner;


public class LotteryApplication {
    private static int[] userArray = new int[5];
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter a number between 1 and 9");
            int input = keyboard.nextInt();
            for (int j = 0; j < userArray.length; j++) {
                userArray[i] = input;
            }
        }
        Lottery computerArray = new Lottery();
        int[] lotteryArray = computerArray.getLotteryArray();
        System.out.println("The winning lottery number is " + lotteryArray);
        
    }
    
    public static void compareArrays(int[] user, int[] computer) {
        int[] matches = new int[5];
        for (int i = 0; i < user.length; i++) {
            if (user[i] == computer[i]) {
                 matches[i] = i;
            }
        }
    }
    
}
