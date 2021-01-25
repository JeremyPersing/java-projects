package telephonenumbertranslator;

public class NumberTranslator {
   private String phoneNumber;

   public NumberTranslator(String num) {
       phoneNumber = num;

   }

   public char[] getNumber() {
       char [] arr = phoneNumber.toCharArray();
       char [] newArr = new char[arr.length];
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'b' || arr[i] == 'B' || arr[i] == 'c' || arr[i] == 'C') {
              newArr[i] = '2';
          }
          else if (arr[i] == 'd' || arr[i] == 'D' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'f' || arr[i] == 'F') {
              newArr[i] = '3';
          }
          else if (arr[i] == 'g' || arr[i] == 'G' || arr[i] == 'h' || arr[i] == 'H' || arr[i] == 'i' || arr[i] == 'I') {
              newArr[i] = '4';
          }
          else if (arr[i] == 'j' || arr[i] == 'J' || arr[i] == 'k' || arr[i] == 'K' || arr[i] == 'l' || arr[i] == 'L') {
              newArr[i] = '5';
          }
          else if (arr[i] == 'm' || arr[i] == 'M' || arr[i] == 'n' || arr[i] == 'N' || arr[i] == 'o' || arr[i] == 'O') {
              newArr[i] = '6';
          }
          else if (arr[i] == 'p' || arr[i] == 'P' || arr[i] == 'q' || arr[i] == 'Q' || arr[i] == 'r' || arr[i] == 'R' ||
                    arr[i] == 's' || arr[i] == 'S') {
              newArr[i] = '7';
          }
          else if (arr[i] == 't' || arr[i] == 'T' || arr[i] == 'u' || arr[i] == 'U' || arr[i] == 'v' || arr[i] == 'V') {
              newArr[i] = '8';
          }
          else if (arr[i] == 'w' || arr[i] == 'W' || arr[i] == 'x' || arr[i] == 'X' || arr[i] == 'y' || arr[i] == 'Y' ||
                  arr[i] == 'z' || arr[i] == 'Z') {
              newArr[i] = '9';
          }
          else if (arr[i] == '-') {
              newArr[i] = '-';
          }
          else if (arr[i] == '0' || arr[i] == '1' || arr[i] == '2' || arr[i] == '3' || arr[i] == '4' || arr[i] == '5' || arr[i] == '6' ||
                  arr[i] == '7' || arr[i] == '8' || arr[i] == '9') {
              newArr[i] = arr[i];
          }
      }
      return newArr;
   }
}
