
package retail.store.holder;


public class RetailStoreHolder {

    public static void main(String[] args) {
        
        RetailItem item1 = new RetailItem("Jacket", 12, "$25.00");
        RetailItem item2 = new RetailItem("Hat", 30, "$10.00");
        RetailItem item3 = new RetailItem("Jeans", 15, "$49.99");
        
        System.out.println("Description\tUnits On Hand\tPrice");
        System.out.println("-------------------------------------------");
        
        System.out.println(item1.getDescription() + "\t\t" + item1.getUnitsOnHand() 
                            + "\t\t" + item1.getPrice());
        System.out.println(item2.getDescription() + "\t\t" + item2.getUnitsOnHand() 
                            + "\t\t" + item2.getPrice());
        System.out.println(item3.getDescription() + "\t\t" + item3.getUnitsOnHand() 
                            + "\t\t" + item3.getPrice());
    }
    
}
