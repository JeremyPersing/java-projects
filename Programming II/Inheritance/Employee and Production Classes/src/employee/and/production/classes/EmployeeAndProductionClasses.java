package employee.and.production.classes;
import java.util.Scanner;

public class EmployeeAndProductionClasses {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ProductionWorker workerOne = new ProductionWorker();
        
        System.out.println("Enter name of employee: ");
        String name = keyboard.nextLine();
        workerOne.setName(name);
        
        System.out.println("Enter employee number: ");
        String num = keyboard.nextLine();
        workerOne.setNumber(num);
        
        System.out.println("Enter date hired: ");
        String day = keyboard.nextLine();
        workerOne.dateHired(day);
        
        System.out.println("Enter shift number: ");
        int shift = keyboard.nextInt();
        workerOne.getShift(shift);
        
        System.out.println("Enter payrate: ");
        double money = keyboard.nextDouble();
        workerOne.getPay(money);
        
        System.out.println(workerOne);
    }
}
        
