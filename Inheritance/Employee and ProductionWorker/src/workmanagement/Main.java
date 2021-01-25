package workmanagement;


public class Main{

    public static void main(String[] args) throws InvalidPayRate, InvalidEmployeeNumber, InvalidShift{
        try {
            ProductionWorker employeeOne = new ProductionWorker("John", "556-M", "11/23/99", 2, 15);
            employeeOne.getShift();
            employeeOne.getMonthlyPay(40);
        }
        catch (InvalidShift | InvalidEmployeeNumber | InvalidPayRate e) {
            System.out.println(e.getMessage());
        }
    }
}
