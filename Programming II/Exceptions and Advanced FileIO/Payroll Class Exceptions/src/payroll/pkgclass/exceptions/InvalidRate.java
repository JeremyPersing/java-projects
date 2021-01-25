package payroll.pkgclass.exceptions;


public class InvalidRate extends Exception{
    public InvalidRate() {
        super("ERROR: Invalid hourly pay rate");
    }
}
