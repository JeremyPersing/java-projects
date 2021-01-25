package carinstrumentsimulator;

public class Main {

    public static void main(String[] args) {
        FuelGauge carsGauge = new FuelGauge(0);
        System.out.println("Filling car up: " + carsGauge.fillTank(15) + " gallons.");
        Odometer carOdometer = new Odometer(999900, carsGauge);
        for (int i = 0; i < carsGauge.getGallons(); i++) {
            System.out.println("Mileage: " + carOdometer.calculateMileage(24) + " miles");
            System.out.println("Fuel: " + carOdometer.milesTraveled(24) + " gallons");
        }

    }
}
