package carinstrumentsimulator;

public class FuelGauge {
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public int fillTank(int num) {
        for (int i = 0; i < num; i++) {
            fuel++;
        }
        return fuel;
    }

    public int getfuelBurned(int num) {
        for (int i = num; i > 0; i--) {
            fuel--;
        }

        return fuel;
    }

    public int getGallons() {
        return fuel;
    }

}
