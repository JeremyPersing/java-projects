package areacalculator;

public class Area {
    private static double area;

    public static double getArea(double radius) {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double getArea(double length, double width) {
        area = length * width;
        return area;
    }

    public static double getArea(double pi, double radius, double height) {
        pi = Math.PI;
        area = pi * Math.pow(radius, 2) * height;
        return area;
    }

}
