package vowels.and.consonants;

public class SentenceData {

    
    public int getVowels(String sentence) {
        int vowelsFound = 0;
        char[] strUsed = sentence.toLowerCase().toCharArray();
        
        
        for (int i = 0; i < sentence.length(); i++){
           if(strUsed[i] == 'a' || strUsed[i] == 'e' || strUsed[i] == 'i' || strUsed[i] == 'o' ||
              strUsed[i] == 'u') {
               vowelsFound += 1;
           }
        }
        return vowelsFound;
    }
    
    public int getConsonants(String sentence) {
        int consonantsFound = 0;
        char[] strUsed = sentence.toLowerCase().toCharArray();
        
        for (int i = 0; i < sentence.length(); i++) {
            if (strUsed[i] == 'b' || strUsed[i] == 'c' || strUsed[i] == 'd' || strUsed[i] == 'f' ||
                    strUsed[i] == 'g' || strUsed[i] == 'h' || strUsed[i] == 'j'|| strUsed[i] == 'k' ||
                    strUsed[i] == 'l' || strUsed[i] == 'm' || strUsed[i] == 'n' || strUsed[i] == 'p' ||
                    strUsed[i] == 'q' || strUsed[i] == 'r' || strUsed[i] == 's' || strUsed[i] == 't' ||
                    strUsed[i] == 'v' || strUsed[i] == 'w' || strUsed[i] == 'x' || strUsed[i] == 'y' ||
                    strUsed[i] == 'z') {
                consonantsFound += 1;
            }
        }
        return consonantsFound;
    }
}
