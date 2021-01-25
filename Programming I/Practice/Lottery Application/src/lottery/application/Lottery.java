package lottery.application;
import java.util.Random;


public class Lottery {
    private int[] lotteryArray = new int[5];
    
    public Lottery() {
        Random randomNum = new Random();
        for (int i = 0; i < lotteryArray.length; i++) {
            int num = randomNum.nextInt(9) + 1;
            lotteryArray[i] = num;
        }
    }
    
    public int[] getLotteryArray() {
        return lotteryArray;
    }
}
