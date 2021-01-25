package analyzable.pkginterface;
import java.util.Scanner;

public class CourseGradesDemonstrator2 {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        CourseGrades2 studentGrades = new CourseGrades2();
        GradedActivity2 labScore = new GradedActivity2();
       
//        Getting student's lab score
        System.out.println("Enter the score for the student's lab.");
        double lab = keyboard.nextDouble();
        
        labScore.setScore(lab);   
        studentGrades.setLab(labScore);
        
//        Getting student's pass/fail score
        int passFailQuestions = 10;
        int passFailMin = 70;
        
        System.out.println("Enter the number of questions missed on the pass/fail exam.");
        int missed = keyboard.nextInt();
        
        PassFailExam2 pF = new PassFailExam2(missed, passFailMin, passFailQuestions);
        studentGrades.setPassFailExam(pF);
        
//        Getting student's essay score
        System.out.println("Enter the essay score for grammar (out of 30).");
        int gram = keyboard.nextInt();
        
        System.out.println("Enter the essay score for spelling (out of 20).");
        int spell = keyboard.nextInt();
        
        System.out.println("Enter the essay score for length (out of 20).");
        int length = keyboard.nextInt();
        
        System.out.println("Enter the essay score for content (out of 30).");
        int content = keyboard.nextInt();
        
        Essay2 studentEssay = new Essay2(gram, spell, length, content);
        studentGrades.setEssay(studentEssay);
        
        
//        Getting student's final exam score
        int questions = 50;
        
        System.out.println("Enter the amount of quesions missed on the final.");
        int qMissed = keyboard.nextInt();
        
        FinalExam2 finalScore = new FinalExam2(qMissed, questions);
        studentGrades.setFinalExam(finalScore);
        
        System.out.print(studentGrades);
    }
    
}
