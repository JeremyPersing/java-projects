package exception.project;


public class InvalidEmployeeNumber extends Exception{
    
    public InvalidEmployeeNumber() {
        super("ERROR: Invalid Employee Number");
    }
}
