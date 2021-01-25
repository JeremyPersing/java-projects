package payroll.pkgclass.exceptions;


public class InvalidHours extends Exception{   
    public InvalidHours() {
        super("ERROR: Invalid employee hours");
    }
}
