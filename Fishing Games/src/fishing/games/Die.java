package fishing.games;
import java.lang.Math;

/**
 *
 * @author Jeremy
 */
public class Die {
    public int rollDie() {
        double randomNum = (Math.random() * 6) + 1;
        int num = (int)randomNum;
        
        return num;
    }
        
    
}
