package payroll.pkgclass.exceptions;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PayrollClassExceptions {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
                
        System.out.println("Enter employee name");
        String name = keyboard.nextLine();
        
        System.out.println("Enter employee ID");
        String identification = keyboard.nextLine();
        
        
        
        System.out.println("Enter the hourly of wage of this employee");
        double wage = keyboard.nextDouble();
        
        System.out.println("Enter the amount of hours the employee worked");
        int hours = keyboard.nextInt();
        
        createEmployeePayRoll(name, identification, hours, wage);
        
    }
    
    
    public static void createEmployeePayRoll(String nombre, String id,
                                             int time, double rate) {
        DecimalFormat dollar = new DecimalFormat("#, ##0.00");
        PayRoll worker;
        
        try {
            worker = new PayRoll(nombre, id);
            worker.setPay(time, rate);
            
            
            
            System.out.println(nombre + " earned $" + dollar.format(worker.getPay()));
        }
        catch (InvalidName | InvalidID  | InvalidHours | InvalidRate e) {
            System.out.println(e.getMessage());
        }
        
    }
}
