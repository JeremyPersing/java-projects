package recursivepopulation;

public class RecursivePopulation {
    private double startingPop, growthRate, duration;


    public double getPopulation(double startingPop, double growthRate, double duration) {
        this.startingPop = startingPop;
        this.growthRate = growthRate;
        this.duration = duration;

        if (duration > 0) {
            return startingPop + startingPop * growthRate + getPopulation(startingPop, growthRate, duration - 1);
        }
        else {
            return 0;
        }
    }
}
