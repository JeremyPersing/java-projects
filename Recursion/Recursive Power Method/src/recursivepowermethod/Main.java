package recursivepowermethod;

public class Main {

    public static void main(String[] args) {
	    System.out.println(power(2,6));
    }

    public static int power(int base, int exponent) {
       if (exponent > 0) {
           return base * power(base, exponent - 1);
       }
       else {
           return 1;
       }

    }
}
