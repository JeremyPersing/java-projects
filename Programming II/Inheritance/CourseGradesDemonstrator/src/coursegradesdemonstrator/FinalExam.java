package coursegradesdemonstrator;


public class FinalExam extends GradedActivity{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    
    public FinalExam(int missed, int questions) {
        double numericScore;
        
        numQuestions = questions;
        numMissed = missed;
        
        pointsEach = 100 / numQuestions;
        numericScore = 100.0 - (missed * pointsEach);
        
        setScore(numericScore);
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
    
    public String toString() {
        String str = getScore() + " " + getGrade();
        return str;
    }
}
