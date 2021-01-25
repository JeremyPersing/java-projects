package exception.project;


public class ExceptionProject {

    
    public static void main(String[] args) {
        System.out.println("Production Worker without any exceptions: ");
        createWorker("Jimmy Neutron", "123-A", "11/23/15", 1, 11);
        
        
        System.out.println("Production Worker with improper employee number");
        createWorker("Batman", "690-Z", "5/7/99", 2, 15);
        
        System.out.println("Production Worker with an invalid shift number");
        createWorker("Bob", "222-B", "3/1/1919", 4, 1);
        
        System.out.println("Production Worker with an invalid pay rate");
        createWorker("Dog", "788-E", "6/1/16", 1, -20);
    }
    
    public static void createWorker(String name, String num, String date, int sh,
                                    double pr) {
        ProductionWorker worker;
        
        try {
            worker = new ProductionWorker(name, num, date, sh, pr);
            
            System.out.println("Object created");
            System.out.println(worker);
        }
        catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidShift e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidPayRate e) {
            System.out.println(e.getMessage());
        }
    }
    
}
