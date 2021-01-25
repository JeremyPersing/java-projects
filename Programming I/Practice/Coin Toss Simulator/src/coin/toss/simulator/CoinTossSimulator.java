package coin.toss.simulator;


public class CoinTossSimulator {

    
    public static void main(String[] args) {
       Coin coinToss = new Coin();
       System.out.println(coinToss.getSideUp());
       
       for (int i = 0; i < 20; i++) {
           coinToss.toss();
           System.out.println(coinToss.getSideUp());
       }
    }
    
}
