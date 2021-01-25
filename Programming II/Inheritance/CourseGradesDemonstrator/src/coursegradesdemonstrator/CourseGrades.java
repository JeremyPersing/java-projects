package coursegradesdemonstrator;


public class CourseGrades{
    
    
    private GradedActivity[] grades = new GradedActivity[4]; 
    
    
    public void setLab(GradedActivity l) {
        grades[0] = l;
    }
    
    public void setPassFailExam(PassFailExam result) {
        grades[1] = result;
    }
    
    public void setEssay(Essay score) {
        grades[2] = score;
    }
    
    public void setFinalExam(FinalExam score) {
        grades[3] = score;
        
    }
    
    public String toString() {
       String str =  "Lab Score: " + grades[0] + "\n" + "Pass Fail Result: " +
                        grades[1] + "\n" + "Essay Score: " + grades[2] + "\n" + 
                        "Final Exam Score: " + grades[3];
       return str;
    }
    
}
