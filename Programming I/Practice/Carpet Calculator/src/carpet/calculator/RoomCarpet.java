package carpet.calculator;


public class RoomCarpet {
    private double carpetCost;
    private RoomDimension size;
    
    public RoomCarpet(RoomDimension dimension, double cost) {
        size = dimension;
        carpetCost = cost;
    }
    
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }
    
    public String toString() {
        String str = "The total cost will be $" + getTotalCost();
        return str;
    }
}
