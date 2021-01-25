package analyzable.pkginterface;


public class PassFailActivity2 extends GradedActivity2{
    private double minPassingScore;
    
    public PassFailActivity2(double mp) {
        minPassingScore = mp;
    }
    
    public char getGrade() {
        char letterGrade;
        
        if (super.getScore() >= minPassingScore) {
            letterGrade = 'P';
        }
        else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
