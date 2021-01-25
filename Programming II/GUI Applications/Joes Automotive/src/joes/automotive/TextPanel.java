package joes.automotive;
import javax.swing.*;
import java.awt.*;
    
public class TextPanel extends JPanel{
    private JLabel parts;
    private JLabel hours;
    
    private JTextField partPrice;
    private JTextField hoursWorked;
    
    public final double HOUR_RATE = 20.00;
    
    public TextPanel() {
        setLayout(new GridLayout(4,1));
        
        parts = new JLabel("Enter the part price");
        hours = new JLabel("Enter the hours of work");
        
        partPrice = new JTextField(7);
        hoursWorked = new JTextField(7);
        
        setBorder(BorderFactory.createTitledBorder("Additional Options"));
        
        add(parts);
        add(partPrice);
        add(hours);
        add(hoursWorked);
        
    }
    
    public double getAdditionalPrice() {
        double totalPrice = 0.0;
        
        String inputOne;
        String inputTwo;
        double pricePart = 0.0;
        double priceWork = 0.0;
        
        inputOne = partPrice.getText();
        inputTwo = hoursWorked.getText();
        
        if (inputOne.equals("")) {
            pricePart = 0;
        }
        if (inputTwo.equals("")) {
            priceWork = 0;
        }
        else {
        pricePart = Double.parseDouble(inputOne);
        priceWork = Double.parseDouble(inputTwo) * HOUR_RATE;
        }
        
        totalPrice = pricePart + priceWork;
        return totalPrice;
    }
}
