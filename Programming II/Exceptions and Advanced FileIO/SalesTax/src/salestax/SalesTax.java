package salestax;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class SalesTax extends JFrame{
    private JPanel panel;
    private JTextField totalSales;
    private JButton calcButton;
    
    private final double COUNTY_RATE = .04;
    private final double STATE_RATE = .02;
    
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 100;
    
    public SalesTax() {
        setTitle("Monthly Sales Tax Reporter");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        add(panel);
        
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }
    
    private void buildPanel() {
     JLabel totalSalesMessage = new JLabel("Enter the total sales");
     
     totalSales = new JTextField(10);
     
     calcButton = new JButton("Calculate Sales Tax");
     
     calcButton.addActionListener(new CalcButtonListener());
     
     panel = new JPanel();
     
     panel.add(totalSalesMessage);
     panel.add(totalSales);
     panel.add(calcButton);
    }
    
    private class CalcButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            double totalSalesAmount;
            double countyTax;
            double stateTax;
            double totalTax;
            
            DecimalFormat dollar = new DecimalFormat("#, ##0.00");
            
            totalSalesAmount = Double.parseDouble(totalSales.getText());
            
            countyTax = totalSalesAmount * COUNTY_RATE;
            
            stateTax = totalSalesAmount * STATE_RATE;
            
            totalTax = countyTax + stateTax;
            
            JOptionPane.showMessageDialog(null, "County Sales Tax: $" +
                                          dollar.format(countyTax) + "\nState Sales Tax: $" +
                                        dollar.format(stateTax) + "\nTotal Sales Tax: $" +
                                        dollar.format(totalTax));
        }
    }
    
    public static void main(String[] args) {
        SalesTax taxes = new SalesTax();
    }
}
