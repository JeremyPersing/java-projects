package carpetcalculator;

public class RoomDimension {
    public double roomLength, roomWidth;
    private double area;

    public RoomDimension(double length, double width) {
        roomLength = length;
        roomWidth = width;
    }

    public double getArea() {
        area = roomLength * roomWidth;
        return area;
    }

    public String toString() {
        String str = "The area of the room is " + getArea();
        return str;
    }
}
