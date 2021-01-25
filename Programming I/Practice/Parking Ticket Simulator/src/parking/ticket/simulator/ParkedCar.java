package parking.ticket.simulator;


public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String license;
    private int minutesParked;
    
    
    public String getMake(String carMake) {
        make = carMake;
        return make;
    }
    
    public String getModel(String carModel) {
        model = carModel;
        return model;
    }
    
    public String getColor(String carColor) {
        color = carColor;
        return color;
    }
    
    public String getLicense(String licensePlate) {
        license = licensePlate;
        return license;
    }
    
    public int getMinutesParked(int minutes) {
        minutesParked = minutes;
        return minutesParked;
    }
}
