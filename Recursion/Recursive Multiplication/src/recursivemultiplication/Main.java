package recursivemultiplication;

public class Main {

    public static void main(String[] args) {
	    System.out.println(recursiveMultiplication(9, 5));
    }

    public static int recursiveMultiplication(int x, int y) {
        int value = 0;
        if (x > 0) {
           value = y + recursiveMultiplication(x - 1, y);
        }
        return value;
    }
}
