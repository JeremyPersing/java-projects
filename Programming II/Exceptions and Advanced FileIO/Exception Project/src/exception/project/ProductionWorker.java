package exception.project;

import java.text.DecimalFormat;


public class ProductionWorker extends Employee{
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    
    private int shift;
    private double payRate;
    
    public ProductionWorker(String n, String num, String date,
                            int sh, double pr) throws InvalidEmployeeNumber, InvalidShift,
                                InvalidPayRate {
        super(n, num, date);
        getShift(sh);
        setPay(pr);
    }
    
    public void getShift(int s) throws InvalidShift{
        if (s != DAY_SHIFT && s != NIGHT_SHIFT) {
            throw new InvalidShift(); 
        }
        else{
            shift = s;
        }
    }
    
    public void setPay(double money) throws InvalidPayRate{
        if (money < 0) {
            throw new InvalidPayRate();
        }
        else {
            payRate = money;
        }
    }
    
    public double getPay() {
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
