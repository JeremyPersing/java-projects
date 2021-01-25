package recursive.power.method;


public class RecursivePowerMethod {
    
    public static void main(String[] args) {
        System.out.println("Result: " + RaiseNumber(2, 9));
    }
    
    public static int RaiseNumber(int base, int exponent) {
        int result;
        if (exponent == 0) {
            result = 1;
        }
        else {
            result = base * RaiseNumber(base, exponent - 1); 
        }
        return result;
    }
    
}
