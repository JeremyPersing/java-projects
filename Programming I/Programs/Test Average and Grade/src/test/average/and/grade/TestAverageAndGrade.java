/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.average.and.grade;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class TestAverageAndGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double combinedScores = getScores();
        double average = calcAverage(combinedScores);
        System.out.println("Average: " + average);
        String grade = determineGrade(average);
        System.out.println("Final grade: " + grade);
    }
    
    public static double getScores() {
        double testAmount = 6;
        double initial = 1;
        double scores;
        double allScores = 0;
        Scanner keyboard = new Scanner(System.in);
        
        while (initial < testAmount) {
            System.out.println("Enter the score for test " + initial + ".");
            scores = keyboard.nextInt();
            allScores += scores;
            initial++;
        }
        return allScores;
    }
    
    public static double calcAverage(double average) {
        double testAverage;
        
        testAverage = (average) / 5;
        
        return testAverage;
    }
    
    public static String determineGrade(double average) {
        String finalGrade; 
        if (average >= 90) {
            finalGrade = "A";    
        }
        else if (average < 90 && average >= 80) {
            finalGrade = "B";
        }
        else if (average < 80 && average >= 70) {
            finalGrade = "C";
        }
        else if (average < 70 && average >= 60) {
            finalGrade = "D";
        }
        else {
            finalGrade = "F";
        }
        return finalGrade;
    }
}
