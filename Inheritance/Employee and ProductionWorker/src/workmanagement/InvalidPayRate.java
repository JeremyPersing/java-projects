package workmanagement;

public class InvalidPayRate extends Exception {
    public InvalidPayRate() {
        super("Invalid Pay Rate. Enter a positive number.");
    }
}
