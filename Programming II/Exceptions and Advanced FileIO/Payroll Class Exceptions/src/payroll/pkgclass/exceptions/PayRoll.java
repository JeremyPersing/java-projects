package payroll.pkgclass.exceptions;


public class PayRoll {
    private String employeeName;
    private String idNumber;
    private double payRate;
    private int hoursWorked;
    
    
        public PayRoll(String name, String number) throws InvalidName, InvalidID,
                           InvalidHours, InvalidRate{
            if (name.equals("")) {
                throw new InvalidName();
            }
            else {
                employeeName = name;
            }
            
            if (number.equals("")) {
                throw new InvalidID();
            }
            else {
                idNumber = number;
            }
        }
        
        public void setPay(int hours, double rate) throws InvalidHours, InvalidRate{
            if (hours < 0 || hours > 84) {
                throw new InvalidHours();
            }
            else {
                hoursWorked = hours;
            }
            
            if (rate < 0 || rate > 25) {
                throw new InvalidRate();
            }
            else {
                payRate = rate;
            }
            
        }
        
        public double getPay() {
            double grossPay = payRate * hoursWorked;
            return grossPay;
        }
    
}
