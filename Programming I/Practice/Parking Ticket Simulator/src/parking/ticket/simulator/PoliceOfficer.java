package parking.ticket.simulator;


public class PoliceOfficer {
    private String officerName;
    private String badgeNumber;
    private ParkingMeter minutesAllowed;
    private ParkedCar minutes;
    private ParkedCar car = new ParkedCar();
    private ParkingMeter time = new ParkingMeter(20);
    
    
    public PoliceOfficer(String name, String number) {
        officerName = name;
        badgeNumber = number;
    }

}
