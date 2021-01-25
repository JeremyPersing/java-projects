
package grade.book;

import java.util.Scanner;

public class GradeBook {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfStudents = 5;
        int numberOfTestScores = 4;
        String nameOfStudent;
        String letterGrade;
        double studentScore;
        double studentAverage;
        double[][] studentTestScores;
        GradeHolder students = new GradeHolder(numberOfStudents, numberOfTestScores);
        
        studentTestScores = students.getStudentTestScoresArray();
        
        for (int index = 0; index < numberOfStudents; index++) {
            System.out.println("What is the is the name of student " + (index + 1) + ": ");
            nameOfStudent = keyboard.nextLine();
            students.setName(nameOfStudent);
            
            for (int currentScoreIndex = 0; currentScoreIndex < numberOfTestScores;
                 currentScoreIndex++) {
                System.out.println("Enter score " + (currentScoreIndex + 1) +
                                    " for " + nameOfStudent + ":");
                studentScore = keyboard.nextDouble();
                if (studentScore < 0 || studentScore > 100) {
                    System.out.println("Please enter a valid score: ");
                    studentScore = keyboard.nextDouble();
                }
                keyboard.nextLine();
                students.setScore(index, currentScoreIndex, studentScore);
            }
        }
        
        for (int index = 0; index < numberOfStudents; index++) {
            System.out.print(students.getStudentName(index) + " has the scores: ");
            studentAverage = students.averageTestScore(studentTestScores[index]);
            letterGrade = students.getLetterGrade(studentAverage);
            for (int currentScoreIndex = 0; currentScoreIndex < numberOfTestScores;
                 currentScoreIndex++) {
                System.out.print(studentTestScores[index][currentScoreIndex] + ", ");
            }
            System.out.println(students.getStudentName(index) + " has the average of: " +
                               studentAverage + " with a letter grade of " + letterGrade + ".");
            
        }
        
        
        
    }
    
}
