package pkg2d.array.operations;


public class ArrayOperations {

    
    public static void main(String[] args) {
        int[][] numbers = { {1, 2, 5}, {3, 4, 5}, {6, 7, 8} };
        
        System.out.println("Sum: " + getTotal(numbers));
        System.out.println("Average: " + getAverage(numbers));
        
    }
    
    
    public static int getTotal(int [][] num) {
        int total = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                total += num[row][col];
            }
        }
        return total;
    }
    
    public static double getAverage(int [][] num) {
        double total = 0;
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                total += num[row][col];   
            }
        }
        double average = total / 9;
        return average;
    }
}
