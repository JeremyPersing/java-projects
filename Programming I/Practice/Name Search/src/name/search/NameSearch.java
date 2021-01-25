package name.search;

import java.util.Scanner;

public class NameSearch {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("Enter a name and we'll see if it is popular: ");
        name = keyboard.nextLine();
        
        NameGuide userName = new NameGuide(name);
        
        if (userName.isPopular() == true) {
            System.out.println("That is a popular name");
        }
        else {
            System.out.println("That doesn't appear to be a popular name.");
        }
    }
    
}
