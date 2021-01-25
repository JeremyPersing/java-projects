package ismember;

public class Main {

    public static void main(String[] args) {
	    int [] arr = {2, 3, 6, 7, 4};
	    isMember(arr, 14, 0, arr.length - 1);
    }

    public static void isMember(int [] arr, int val, int start , int finish) throws ArrayIndexOutOfBoundsException{
        try {
            if (arr[finish] != val) {
                isMember(arr, val, start, finish - 1);
            }
            else if (arr[finish] == val) {
                System.out.println("True " + " At Index: " + finish);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("False");
        }

    }
}
