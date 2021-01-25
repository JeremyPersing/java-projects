package pig.latin;
import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
    public static char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    public static char[] CONSONANTS = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                                       'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string and it will be converted to pig latin");
        String str = keyboard.nextLine();
        System.out.println("Pig Latin: ");
        pigLatin(str);
    }
    
    public static void pigLatin(String str) {
       char[] arr = str.toCharArray();
       String newString = "";
       
       for (int i = 0; i < CONSONANTS.length; i++) {
           for (int j = 0; j < VOWELS.length; j++) {
               if (arr[0] == CONSONANTS[i] && arr[1] == VOWELS[j]) {
               char [] newArray = Arrays.copyOfRange(arr, 1, arr.length);
               newString = new String(newArray);
               char firstChar = CONSONANTS[i];
               String firstLetter = Character.toString(firstChar);
               String ending = firstLetter + "ay";
               newString += ending;
               System.out.print(newString);
               
               }
           }
       }
        
       for (int i = 0; i < CONSONANTS.length; i++) {
           for (int j = 0; j < CONSONANTS.length; j++) {
               if (arr[0] == CONSONANTS[i] && arr[1] == CONSONANTS[j]) {
               char [] newArray = Arrays.copyOfRange(arr, 2, arr.length);
               char firstChar = arr[0];
               char secondChar = arr[1];
               newString = new String(newArray);

               String firstLetter = Character.toString(firstChar);
               String secondLetter = Character.toString(secondChar);

               String ending = firstLetter + secondLetter + "ay";
               newString += ending;
               System.out.print(newString);
               }
            } 

       }    
       
       for (int i = 0; i < VOWELS.length; i++) {
           if (arr[0] == VOWELS[i]) {
               newString = new String(arr);
               newString += "way";
               System.out.print(newString);
           }
       }
        
    }
    
}
