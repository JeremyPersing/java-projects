package geometry.calculator;

import java.util.Scanner;
        
public class GeometryCalculator {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        options();
        int userInput = keyboard.nextInt();
        
        while (userInput != 4) {
            if (userInput == 1) {
                System.out.println("The area of the circle is: " + circleAreaCalculator() +
                                   " units squared.");
                options();
                userInput = keyboard.nextInt();

            }
            if (userInput == 2) {
                System.out.println("The area  of the rectangle is: " + 
                        rectangleAreaCalculator() + " units squared.");
                options();
                userInput = keyboard.nextInt();
                
            }
            if (userInput == 3) {
                System.out.println("The area of the trinagle is: " + 
                                    triangleAreaCalculator() + " units squared.");
                options();
                userInput = keyboard.nextInt();
            }
            if (userInput < 1 || userInput > 4) {
                System.out.println("ERROR: Input a valid number");
                options();
                userInput = keyboard.nextInt();
            }
            
        }
        System.out.println("Have a great day");

        
        
    }
    
    public static void options() {
        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate the Area of a Circle.");
        System.out.println("2. Calculate the Area of a Rectangle.");
        System.out.println("3. Calculate the Area of a Triangle.");
        System.out.println("4. Quit");
        System.out.println("Enter your choice (1-4)");
    }
    
    
    public static double circleAreaCalculator() {
        Scanner keyboard = new Scanner(System.in);
        double radius;   
        System.out.println("What is the radius of the circle?");
        radius = keyboard.nextDouble();
        if (radius < 0) {
            System.out.println("ERROR: Enter a number greater than 0");
            radius = keyboard.nextDouble();
        }
        
        double areaOfCircle = Geometry.getCircularArea(radius);
        
        return areaOfCircle;
    }
    
    public static double rectangleAreaCalculator() {
        Scanner keyboard = new Scanner(System.in);
        double length;
        double width;
        System.out.println("Enter the length of the rectangle: ");
        length = keyboard.nextDouble();
        if (length < 0) {
            System.out.println("ERROR: Enter a number greater than 0");
            length = keyboard.nextDouble();
        }
        
        System.out.println("Enter the width of the rectangle: ");
        width = keyboard.nextDouble();
        if (width < 0) {
            System.out.println("ERROR: Enter a number greater than 0");
            width = keyboard.nextDouble();
        }
        
        double areaOfRectangle = Geometry.getRectangleArea(length, width);
        
        return areaOfRectangle;
    }
    
    public static double triangleAreaCalculator() {
        Scanner keyboard = new Scanner(System.in);
        double base;
        double height;
        System.out.println("Enter the base of the triangle: ");
        base = keyboard.nextDouble();
        if (base < 0) {
            System.out.println("ERROR: Enter a number greater than 0");
            base = keyboard.nextDouble();
        }
        
        System.out.println("Enter the height of the rectangle: ");
        height = keyboard.nextDouble();
        if (height < 0) {
            System.out.println("ERROR: Enter a number greater than 0");
            height = keyboard.nextDouble();
        }
        
        double areaOfTriangle = Geometry.getTriangleArea(base, height);
        
        return areaOfTriangle;
    }
}
