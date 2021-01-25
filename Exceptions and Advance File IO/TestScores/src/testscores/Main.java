package testscores;
import java.io.*;

public class Main implements Serializable{

    public static void main(String[] args) throws IOException {
	    double [] arrOne = {55, 0, 87, 99, 100};
	    double [] arrTwo = {22, 55, 37};
	    double [] arrThree = {99, 98, 97, 96};
	    double [] arrFour = {69, 86, 94};
	    double [] arrFive = {77, 78, 89};
	    try {
			TestScores classOne = new TestScores(arrOne);
			TestScores classTwo = new TestScores(arrTwo);
			TestScores classThree = new TestScores(arrThree);
			TestScores classFour = new TestScores(arrFour);
			TestScores classFive = new TestScores(arrFive);
			TestScoreSerialization serialized = new TestScoreSerialization(classOne, classTwo, classThree, classFour, classFive);
			serialized.serializeObjects("objects.dat");
			serialized.deSerializeObject("objects.dat");
		}
	    catch (InvalidTestScore e) {
	    	System.out.println(e.getMessage());
		}

//	    try {
//	    	TestScores classOne = new TestScores(arr);
//	    	for (int i = 0; i < arr.length; i++) {
//	    		if (arr[i] > 100 || arr[i] < 0) {
//	    			throw new IllegalArgumentException("Invalid input");
//				}
//			}
//	    	System.out.println(classOne.getAverage());
//		}
//	    catch (IllegalArgumentException e) {
//	    	System.out.println(e.getMessage());
//		}

//	    try {
//	        TestScores classOne = new TestScores(arr);
//	        TestScoreChecker check = new TestScoreChecker(classOne);
//	        System.out.println("Average: " + classOne.getAverage());
//        }
//	    catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//        }
    }
}
