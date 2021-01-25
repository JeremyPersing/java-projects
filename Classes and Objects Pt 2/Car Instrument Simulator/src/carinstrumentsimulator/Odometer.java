package carinstrumentsimulator;

public class Odometer {
    private int mileage;
    private FuelGauge currentCar;

    public Odometer(int mileage, FuelGauge carGauge) {
        this.mileage = mileage;
        currentCar = new FuelGauge(carGauge.getGallons());
    }

    public int calculateMileage(int miles) {
        if (mileage < 999999) {
            for (int i = 0; i < miles; i++) {
                mileage++;
            }
        }
        else {
            mileage = 0;
            for (int i = 0; i < miles; i++) {
                mileage++;
            }
        }
        return mileage;
    }

    public int milesTraveled(int miles) {
        int milesDriven = miles / 24;

        return currentCar.getfuelBurned(milesDriven);

    }

    public int currentMileage() {
        return mileage;
    }

}
