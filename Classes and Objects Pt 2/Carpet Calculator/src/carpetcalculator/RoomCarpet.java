package carpetcalculator;

public class RoomCarpet {
    private RoomDimension dimensions;
    private double cost, totalCost;

    public RoomCarpet(RoomDimension dim, double price) {
        dimensions = new RoomDimension(dim.roomLength, dim.roomWidth);
        cost = price;
    }

    public double getTotalCost() {
        double area = dimensions.getArea();
        totalCost = area * cost;
        return totalCost;
    }

    public String toString() {
        String str = "The total cost is $" + getTotalCost();
        return str;
    }
}
