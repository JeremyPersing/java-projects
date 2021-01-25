package carpet.calculator;

import java.util.Scanner;

public class CarpetCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double length;
        double width;
        double carpetCost;

        
        
        System.out.println("What is the length of the room in feet?");
        length = keyboard.nextDouble();
        
        System.out.println("What is the width of the room in feet?");
        width = keyboard.nextDouble();
        
        System.out.println("What is the cost of the carpet per square foot?");
        carpetCost = keyboard.nextDouble();
        
        RoomDimension room = new RoomDimension(length, width);
        
        RoomCarpet total = new RoomCarpet(room, carpetCost);
        
        System.out.println(room);
        System.out.println(total);
        
    }
    
}
