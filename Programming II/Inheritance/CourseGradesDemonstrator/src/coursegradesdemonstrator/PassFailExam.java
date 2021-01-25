package coursegradesdemonstrator;


public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int missed, double minPass, int questions) {
        super(minPass);
        double numericScore;
        
        numQuestions = questions;
        numMissed = missed;
        
        pointsEach = 100.0 / numQuestions;
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
