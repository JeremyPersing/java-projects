
package grade.book;

import java.util.ArrayList;

public class GradeHolder {
    private ArrayList<String> names = new ArrayList<>();
    private String[] grades = {"A", "B", "C", "D", "F"};
    private double[][] testScores;

    public String getStudentName(int studentIndex) {
        return names.get(studentIndex);
    }
    
    public double averageTestScore (double[] studentTestScore) {
        double total = 0;
        double average;
        for (int index = 0; index < studentTestScore.length; index++) {
            total += studentTestScore[index];
        }
        
        average = total / studentTestScore.length;
        return average;
    }
    
    public String getLetterGrade(double testScoreAverage) {
        String letterGrade = "";
        
        if (testScoreAverage < 60) {
            letterGrade = "F";
        }
        else if (testScoreAverage < 70) {
            letterGrade = "D";
        }
        else if (testScoreAverage < 80) {
            letterGrade = "C";
        }
        else if (testScoreAverage < 90) {
            letterGrade = "B";
        }
        else if (testScoreAverage <= 100) {
            letterGrade = "A";
        }
        return letterGrade;
    }
    
    public double[][] getStudentTestScoresArray () {
        return testScores;
    }
    
    public void setName(String studentName) {
        names.add(studentName);
    }
    
    public void setScore(int studentIndex, int scoreIndex, double studentScore) {
        testScores[studentIndex][scoreIndex] = studentScore;
    }
    
    public GradeHolder(int numberStudents, int numberTestScores) {
        testScores = new double [numberStudents][numberTestScores];
    }

}
