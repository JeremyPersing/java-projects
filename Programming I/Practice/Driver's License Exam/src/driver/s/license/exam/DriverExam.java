
package driver.s.license.exam;


public class DriverExam {
    private String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D",
                                "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
    
    private int numbers = correctAnswers.length;
    
    private String[] answers;
    
    
    public int totalCorrect() {
        int answersCorrect = 0;
        
        for (int index = 0; index < numbers; index++) {
            if (correctAnswers[index].equalsIgnoreCase(answers[index])) {
                answersCorrect += 1;
            }
        }
        
        return answersCorrect;
    }
    
    public int totalIncorrect() {
        int incorrectAnswers = 0;
        for (int index = 0; index < numbers; index++) {
            if (!(correctAnswers[index].equalsIgnoreCase(answers[index])) )
                incorrectAnswers += 1;
        }
        return incorrectAnswers;
    }
    
    public int[] questionsMissed() {
        int[] questionsMissedArray = new int [numbers];
        int questionsMissedArrayIndex = 0;
        
        for (int index = 0; index < numbers; index++) {
            if(!(correctAnswers[index].equalsIgnoreCase(answers[index]))) {
                 questionsMissedArray[questionsMissedArrayIndex] = index + 1;
                 questionsMissedArrayIndex++;
            }
        }
        return questionsMissedArray;
    }
    
    public boolean passed() {
        boolean passing = false;
        int passingScore = 15;
        
        if (totalCorrect() >= passingScore) {
            passing = true;
        }
        
        return passing;
        
    }
    
    public DriverExam( String [] studentAnswers) {
         answers = studentAnswers;
    }
}
