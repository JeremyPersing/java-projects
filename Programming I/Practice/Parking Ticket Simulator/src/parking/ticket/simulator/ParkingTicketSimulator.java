package parking.ticket.simulator;

import java.util.Scanner;

public class ParkingTicketSimulator {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String model;
        String make;
        String color;
        String license;
        String officerName;
        String badge;
        
        int minutesParked;
        int minutesPurchased;
        
        System.out.println("Model of car: ");
        model = keyboard.nextLine();
        
        System.out.println("Make of car: ");
        make = keyboard.nextLine();
        
        System.out.println("Color of car: ");
        color = keyboard.nextLine();
        
        System.out.println("License Plate of car: ");
        license = keyboard.nextLine();
        
        System.out.println("Minutes parked: ");
        minutesParked = keyboard.nextInt();
        
        System.out.println("Minutes purchased: ");
        minutesPurchased = keyboard.nextInt();
        
        System.out.println("Officer's name: ");
        officerName = keyboard.nextLine();
        
        System.out.println("Badge number: ");
        badge = keyboard.nextLine();
        
        
    }
    
}
