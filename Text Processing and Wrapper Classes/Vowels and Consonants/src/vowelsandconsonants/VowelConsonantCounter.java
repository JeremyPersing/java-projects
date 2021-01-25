package vowelsandconsonants;
import java.util.Scanner;

public class VowelConsonantCounter {
    private char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y'};
    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    private String userString = "";
    private int totalVowels, totalConsonants;

    public String getString() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string: ");
        userString = keyboard.nextLine();
        return userString;
    }

    public int numOfVowels() {
        totalVowels = 0;

        for (int i = 0; i < userString.length(); i++) {
            for (int  j = 0; j < vowels.length; j++) {
                if (userString.charAt(i) == vowels[j]) {
                    totalVowels += 1;
                }
            }
        }
        return totalVowels;
    }

    public int numConsonants() {
        totalConsonants = 0;

        for (int i = 0; i < userString.length(); i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (userString.charAt(i) == consonants[j]) {
                    totalConsonants += 1;
                }
            }
        }

        return totalConsonants;
    }

    public int getBoth() {
        return userString.length();
    }


}
