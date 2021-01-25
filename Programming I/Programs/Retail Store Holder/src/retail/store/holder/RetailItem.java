
package retail.store.holder;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private String price;
    
    
    
    public RetailItem(String item, int inventory, String dollars) {
        description = item;
        unitsOnHand = inventory;
        price = dollars;
    }
    
    public void setDescrition(String item) {
        description = item;
    }
    
    public void setUnitsOnHand(int inventory) {
        unitsOnHand = inventory;
    }
    
    public void setPrice(String dollars) {
        price = dollars;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    
    public String getPrice() {
        return price;
    }
}
