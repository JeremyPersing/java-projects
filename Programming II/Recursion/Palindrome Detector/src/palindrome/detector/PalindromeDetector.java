package palindrome.detector;
import javax.swing.*;


public class PalindromeDetector {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a string to determine if " +
                        "it is a palindrome (Don't include spaces)");
        
        if (isPalindrome(input)) {
            JOptionPane.showMessageDialog(null, input + " is a palindrome");
        }
        else {
            JOptionPane.showMessageDialog(null, input + " is not a palindrome");
        }
    }
    
    private static boolean isPalindrome(String str) {
        
        
        if (str.length() == 1) {
            return true;
        }
        
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        
        return false;
    }
}
