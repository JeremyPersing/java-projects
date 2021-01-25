package sorted.names;
import java.util.Scanner;

public class SortedNames {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nameOne, nameTwo, nameThree;
        System.out.println("Enter a name");
        nameOne = keyboard.nextLine();
        System.out.println("Enter another name");
        nameTwo = keyboard.nextLine();
        System.out.println("Enter another name");
        nameThree = keyboard.nextLine();
        
        
        if (nameOne.charAt(0) > nameTwo.charAt(0) || nameOne.charAt(0) > nameThree.charAt(0)
                && nameTwo.charAt(0) > nameThree.charAt(0)) {
            System.out.print(nameOne + "\n" + nameTwo + "\n" + nameThree);
        }
        else if (nameTwo.charAt(0) > nameOne.charAt(0) || nameTwo.charAt(0) > nameThree.charAt(0) 
                && nameOne.charAt(0) > nameThree.charAt(0)) {
            System.out.print(nameTwo + "\n" + nameOne + "\n" + nameThree);
        }
        else if (nameThree.charAt(0) > nameOne.charAt(0) || nameThree.charAt(0) > nameTwo.charAt(0) 
                && nameOne.charAt(0) > nameTwo.charAt(0)) {
            System.out.print(nameThree + "\n" + nameOne + "\n" + nameTwo);
        }
    }
    
}
