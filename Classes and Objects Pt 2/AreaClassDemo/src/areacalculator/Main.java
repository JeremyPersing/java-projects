package areacalculator;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Circle: " + area.getArea(5));
        System.out.println("Rectangle: " + area.getArea(5, 4));
        System.out.println("Cylinder: " + area.getArea(3.14, 4,8));
    }
}
