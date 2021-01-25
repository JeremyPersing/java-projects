package backwardstring;

public class Main {

    public static void main(String[] args) {
        System.out.println(backwardString("racecar"));
    }

    public static String backwardString(String str) {
        String backwardsString = "";
        for (int i = (str.length() - 1) ; i > -1; i--) {
            backwardsString += Character.toString(str.charAt(i));
        }
        return backwardsString;
    }
}
