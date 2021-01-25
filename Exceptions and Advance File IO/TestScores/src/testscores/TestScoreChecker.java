package testscores;

import java.io.*;

public class TestScoreChecker extends Exception implements Serializable {
    public TestScoreChecker(TestScores obj) {
        double [] userArray = obj.testScores;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] > 100) {
                throw new IllegalArgumentException("You input a number greater than 100");
            }
            if (userArray[i] < 0) {
                throw new IllegalArgumentException("You input a number less than 0");
            }
        }
    }

}
