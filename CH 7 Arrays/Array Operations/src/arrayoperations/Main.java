package arrayoperations;

public class Main {

    public static void main(String[] args) {
	    double [] arr = {12, 14, 6, 7, -1, 3, 5, 6};
	    System.out.println("Total: " + getTotal(arr) + "\nAverage: " + getAverage(arr) + "\nHighest Number: " +
                getHighest(arr) + "\nLowest Number: " + getLowest(arr));
    }

    public static double getTotal(double [] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total;
    }

    public static double getAverage(double[] nums) {
        double average = 0;
        for (int i = 0; i < nums.length; i++) {
            average += nums[i];
        }
        return average / nums.length;
    };

    public static double getHighest(double [] nums) {
        double highest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest) {
                highest = nums[i];
            }
        }
        return highest;
    }

    public static double getLowest(double [] nums) {
        double lowest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < lowest) {
                lowest = nums[i];
            }
        }
        return lowest;
    }
}
