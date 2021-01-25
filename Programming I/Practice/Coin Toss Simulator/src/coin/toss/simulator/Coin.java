package coin.toss.simulator;
import java.util.Random;


public class Coin {
    private String sideUp;
    
    public Coin() {
        Random randomNum = new Random();
        int random = randomNum.nextInt(2) + 1;

        if (random == 1) {
            sideUp = "Heads";
        }
        if (random == 2) {
            sideUp = "Tails";      
        }
    }
    
    public void toss() {
        Random num = new Random();
        int tossNum = num.nextInt(2) + 1;
        
        if (tossNum == 1) {
            sideUp = "Heads";
        }
        if (tossNum == 2) {
            sideUp = "Tails";
        }
    }
    
    public String getSideUp() {
        return sideUp;
    }
}
