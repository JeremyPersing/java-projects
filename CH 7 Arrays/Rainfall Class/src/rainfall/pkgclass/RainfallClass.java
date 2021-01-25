package rainfall.pkgclass;

/**
 *
 * @author Jeremy
 */
public class RainfallClass {
    public static double [] RAINFALL = {3, 10, 3, 5, 7, 2, 1, 1, .5, .3, 3.3, 2.4};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rainfall year2018 = new Rainfall();
        double total = year2018.getTotalRainfall(RAINFALL);
        
        System.out.println("In CA, during 2018, there was a total of " + total + 
                " inches of rain");
        System.out.println("The average per month was: " + year2018.averageRainfall(total) + " inches");
        System.out.println("The month with the highest amount of rainfall was " +
                (year2018.getMostRain(RAINFALL) + 1));
        System.out.println("The month with the least amount of rainfall was: " +
                (year2018.getLowestRain(RAINFALL) + 1));
    }   
    
}
