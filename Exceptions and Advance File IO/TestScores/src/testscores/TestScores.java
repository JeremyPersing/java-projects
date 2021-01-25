package testscores;

import java.io.*;

public class TestScores implements Serializable{
    protected double [] testScores;

    public TestScores(double [] arr) throws InvalidTestScore {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > 100) {
                throw new InvalidTestScore();
            }
        }
        testScores = arr;
    }

    public double getAverage() {
        double total = 0;
        for (int i = 0; i < testScores.length; i++) {
            total += testScores[i];
        }
        double average = total / testScores.length;
        return average;
    }
}
