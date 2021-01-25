package parking.ticket.simulator;


public class ParkingTicket {
    private ParkedCar make;
    private ParkedCar model;
    private ParkedCar color;
    private ParkedCar license;
    private int fineAmount;
    private PoliceOfficer officer;
    
    
    public ParkingTicket(ParkedCar carMake, ParkedCar carModel, ParkedCar
                              carColor, ParkedCar licensePlate) {
        make = carMake;
        model = carModel;
        color = carColor;
        license = licensePlate;

    }
    
    public int getFine(int time) {
        if (time <= 1 && time > 0) {
            fineAmount = 25;
        }
        else {
            fineAmount = 25 + (10 * time);
        }
        return fineAmount;
    }
    
    public String PoliceOfficer() {
        return 
    }
}
