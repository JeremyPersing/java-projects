package sumofnumbers;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSum(5));
        System.out.println(getSum(-5));
    }

    public static int getSum(int num) {
        if (num > 0) {
            return num + getSum(num - 1);
        }
        if (num < 0) {
            return num + getSum(num + 1);
        }
        else {
            return 0;
        }

    }
}
