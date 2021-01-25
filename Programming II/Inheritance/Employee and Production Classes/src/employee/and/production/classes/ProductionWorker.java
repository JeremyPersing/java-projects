package employee.and.production.classes;
import java.text.DecimalFormat;

public class ProductionWorker extends Employee {
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    
    private int shift;
    private double payRate;
    
    public ProductionWorker() {
        super();
        shift = DAY_SHIFT;
        payRate = 0.0;
    }
    
    public void getShift(int s) {
        shift = s;
    }
    
    public double getPay(double money) {
        payRate = money;
        return payRate;
    }
    
    public String toString() {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        String str = super.toString();
        
        str += "\nShift: ";
        if (shift == DAY_SHIFT) {
            str += "Day";
        }
        else if (shift == NIGHT_SHIFT) {
            str += "Night";
        }
        else {
            str += "Invalid Shift Number";
        }
        
        str += "\n" + "Hourly pay: $" + dollar.format(payRate);
        
        return str;
    }
}