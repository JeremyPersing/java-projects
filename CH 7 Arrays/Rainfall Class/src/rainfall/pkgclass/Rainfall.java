package rainfall.pkgclass;

/**
 *
 * @author Jeremy
 */
public class Rainfall {
    
    public double getTotalRainfall(double [] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    
    public double averageRainfall(double num) {
        double average = num / 12;
        return average;
    }
    
    public int getMostRain(double [] arr) {
        double highestMonth = 0;
        int i = 0;
        int index = 0;
        while (i < arr.length) {
            if (arr[i] > highestMonth) {
                highestMonth = arr[i];
            }  
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == highestMonth) {
                index = j;
            }
        }
        return index;
    }
    
    public int getLowestRain(double [] arr) {
        double lowestMonth = 25;
        int i = 0;
        int index = 0;
        while (i < arr.length) {
            if (arr[i] < lowestMonth) {
                lowestMonth = arr[i];
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == lowestMonth) {
                index = j;
            }
        }
        return index;
    }
}
