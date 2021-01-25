
package celsius.to.fahrenheit.table;


public class CelsiusToFahrenheitTable {


    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("------------------------------");
        for (int i = 0; i < 21; i++) {
            int f = ((9/5)*i) + 32;
            System.out.println(i + "\t\t" + f);
        }
               
    }
    
}
