package geometry.calculator;


public class Geometry {
    

    
    public static double getCircularArea(double radius) {
        return (Math.PI * radius * radius); 
    }
    
    public static double getRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double getTriangleArea(double base, double height) {
        return base * height * 0.5;
    }
}
