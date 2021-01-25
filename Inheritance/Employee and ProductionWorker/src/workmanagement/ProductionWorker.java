package workmanagement;

public class ProductionWorker extends Employee {
    protected int shift;
    protected double hourlyPay;

    public ProductionWorker(String name, String num, String hireDate, int shift, double hourlyPay) throws InvalidEmployeeNumber, InvalidPayRate{
        super(name, num, hireDate);
        if (hourlyPay < 0) {
            throw new InvalidPayRate();
        }
        this.shift = shift;
        this.hourlyPay = hourlyPay;
    }

    public void getShift() throws InvalidShift{
        if (shift == 1) {
            System.out.println("The worker works the day shift");
        }
        else if (shift == 2) {
            System.out.println("The worker works the night shift");
        }
        else {
            throw new InvalidShift();
        }
    }

    public void getMonthlyPay(double hours) {
        double monthlyPay = hourlyPay * hours * 4;
        System.out.println("Production worker " + number + " earns a total of $" + monthlyPay + " per month");
    }

}
