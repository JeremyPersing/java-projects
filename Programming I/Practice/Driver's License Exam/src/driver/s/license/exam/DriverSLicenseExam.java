
package driver.s.license.exam;

import java.util.Scanner;

public class DriverSLicenseExam {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int questionsAmount = 20;
        String studentAnswers[] = new String[questionsAmount];
        
        
        for (int index = 0; index < studentAnswers.length; index++) {
            String answerResponse;
            System.out.println(index + 1 + " Enter your answer: ");
            answerResponse = keyboard.nextLine();
            
            while (!(answerResponse.equalsIgnoreCase("A")) && !(answerResponse.equalsIgnoreCase("B")) &&
                    !(answerResponse.equalsIgnoreCase("C")) && !(answerResponse.equalsIgnoreCase("D"))) {
                System.out.println("Enter a valid answer. ");
                answerResponse = keyboard.nextLine();
            }
            
            studentAnswers[index] = answerResponse;
        }
        
        DriverExam drivingTest = new DriverExam(studentAnswers);
        
        if ( drivingTest.passed() == true) {
            System.out.println("You passed!");
        }
        else {
            System.out.println("You failed.");
        }
        
        System.out.println("You got " + drivingTest.totalCorrect() + " answers correct" +
                            " and " + drivingTest.totalIncorrect() + 
                            " answers incorrect.");
        System.out.println("You missed questions: ");
        for (int index = 0; index < drivingTest.questionsMissed().length; index++){
            if (drivingTest.questionsMissed()[index] != 0) {
                System.out.print( drivingTest.questionsMissed()[index] + " ");
            }
        }
    }
    
}