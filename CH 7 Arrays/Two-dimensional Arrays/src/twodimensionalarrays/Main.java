package twodimensionalarrays;

public class Main {

    public static void main(String[] args) {
        double [][] arr = {{3, 4, 5, 6}, {12, 13, 14, 15}, {21, 14, 18, 12}};
        System.out.println(getTotal(arr));
        System.out.println(getAverage(arr));
        System.out.println(getRowTotal(arr, 1));
        System.out.println((getColumnTotal(arr, 1)));
        System.out.println(getHighestInRow(arr, 0));
        System.out.println(getLowestInRow(arr, 2));
    }

    public static double getTotal(double [][] nums) {
        double total = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                total += nums[row][col];
            }
        }
        return total;
    }

    public static double getAverage(double [][] nums) {
        int numberOfColumnElements = 0;
        int numberOfRowElements = 0;
        double total = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                total += nums[row][col];
                numberOfColumnElements = nums[row].length;
            }
            numberOfRowElements = nums.length;
        }
        return total / (numberOfColumnElements * numberOfRowElements);
    }

    public static double getRowTotal(double [][] nums, int num) {
        double rowTotal = 0;
        for (int i = 0; i < nums[num].length; i++) {
            rowTotal += nums[num][i];
        }
        return rowTotal;
    }

    public static double getColumnTotal (double [][] nums, int num) {
        double columnTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            columnTotal += nums[i][num];
        }
        return columnTotal;
    }

    public static double getHighestInRow(double [][] nums, int num) {
        double highest = nums[num][0];

        for (int i = 0; i < nums[num].length; i++) {
            if (nums[num][i] > highest) {
                highest = nums[num][i];
            }
        }
        return highest;
    }

    public static double getLowestInRow(double [][] nums, int num) {
        double lowest = nums[num][0];
        for (int i = 0; i < nums[num].length; i++) {
            if (nums[num][i] < lowest) {
                lowest = nums[num][i];
            }
        }
        return lowest;
    }
}
