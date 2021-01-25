package maxelement;

public class Main {

    public static void main(String[] args) {
	    int [] arr = {2, 3, 4, 5, 7, 8, 10};
	    System.out.println(maxElement(arr, 0));
    }

    public static int maxElement(int [] arr, int start){
        int highest = 0;

        if (arr[start] < highest) {
            maxElement(arr, start + 1);
        }
        else {
            highest = arr[start];
        }
        return highest;
    }
}
