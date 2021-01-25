package coursegradesdemonstrator;


public class Essay extends GradedActivity {
    
    private int grammar;
    private int spelling;
    private int length;
    private int content;

    
    public Essay(int g, int s, int cl, int c) {
        grammar = g;
        spelling = s;
        length = cl;
        content = c;
        
        double finalScore = grammar + spelling + length + content;
        
        setScore(finalScore);
    }
    
    public String toString() {
        String str = getScore() + " " + getGrade();
        return str;
    }

}
