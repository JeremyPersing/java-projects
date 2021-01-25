package vowelsandconsonants;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        VowelConsonantCounter stringOne = new VowelConsonantCounter();
        stringOne.getString();

        String input;
        do {
            options();
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("a")) {
                System.out.println("Vowels : " +stringOne.numOfVowels());
            }
            else if (input.equalsIgnoreCase("b")) {
                System.out.println("Consonants: " + stringOne.numConsonants());
            }
            else if (input.equalsIgnoreCase("c")) {
                System.out.println("Vowels + Consonants: " + stringOne.getBoth());
            }
            else if (input.equalsIgnoreCase("d")) {
                stringOne.getString();
            }

        } while (!input.equals("e"));
    }

    public static void options() {
        System.out.println("a. Count the number of vowels in the string\nb. Count the number of consonants in the string" +
                            "\nc. Count both the vowels and consonants in the string\nd. Enter another string" +
                            "\ne. Exit the program");
    }

}
