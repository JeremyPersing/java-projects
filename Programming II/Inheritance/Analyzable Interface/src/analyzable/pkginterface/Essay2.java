
package analyzable.pkginterface;


public class Essay2 extends GradedActivity2{
    private int grammar;
    private int spelling;
    private int length;
    private int content;

    
    public Essay2(int g, int s, int cl, int c) {
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
