package carpetcalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter the length of the room");
	    double lengthOfRoom = keyboard.nextDouble();
	    System.out.println("Enter the width of the room");
	    double widthOfRoom = keyboard.nextDouble();

	    RoomDimension dimension = new RoomDimension(lengthOfRoom, widthOfRoom);
	    RoomCarpet carpet = new RoomCarpet(dimension, 4);
	    System.out.println(dimension + "\n" + carpet);
    }
}
