package carpet.calculator;


public class RoomDimension {
    private double length;
    private double width;
    
    public RoomDimension(double len, double w) {
        length = len;
        width = w;
    }
    
    public double getArea() {
        return length *  width;
    }
    
    public String toString() {
        String str = "The area of the room is " + getArea();
        return str;
    }
           
}
