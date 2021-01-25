package analyzable.pkginterface;


public class CourseGrades2 extends GradedActivity2 implements Analyzable{
    private GradedActivity2[] grades = new GradedActivity2[4]; 
    
    
    public void setLab(GradedActivity2 l) {
        grades[0] = l;
    }
    
    public void setPassFailExam(PassFailExam2 result) {
        grades[1] = result;
    }
    
    public void setEssay(Essay2 score) {
        grades[2] = score;
    }
    
    public void setFinalExam(FinalExam2 score) {
        grades[3] = score;
        
    }
    
    public String toString() {
       String str =  "Lab Score: " + grades[0] + "\n" + "Pass Fail Result: " +
                        grades[1] + "\n" + "Essay Score: " + grades[2] + "\n" + 
                        "Final Exam Score: " + grades[3] + "\n" + "Average Score: " + getAverage() 
                      + "\n" + "Highest Score: " + getHighest() + "\n" + "Lowest Score: " 
                      + getLowest();
       return str;
    }
    
    public double getAverage() {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i].getScore();
            average = sum / grades.length;
        }
        return average;
    }

    public  GradedActivity2 getHighest() {
        GradedActivity2 max = new GradedActivity2();
        max.setScore(0);
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() > max.getScore()) {
                max = grades[i];
            }
        }
        return max;
    }; 
   
    public GradedActivity2 getLowest() {
        GradedActivity2 min = new GradedActivity2();
        min.setScore(101);
        for (int i = 0; i < grades.length; i++) {
           if (grades[i].getScore() < min.getScore()) {
               min = grades[i];
           } else {
           }
        }
        return min;
    };
}
