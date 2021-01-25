package average.rainfall;
import javax.swing.*;
import java.awt.event.*;


public class AverageRainfall extends JFrame{
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 400;
    private JPanel panel;
    private JLabel yearsMessage;
    private JTextField years;
    private JButton calculate;
    private int annualRf;
    
    
    public AverageRainfall() {
        setTitle("Average Rainfall Calculator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        add(panel);
        
        setVisible(true);
    }

    public void buildPanel() {
        yearsMessage = new JLabel("Enter a number in years");
        years = new JTextField(10);
        calculate = new JButton("Calculate Rainfall");
        
        calculate.addActionListener(new CalcButtonListener());
        
        panel = new JPanel();
        
        panel.add(yearsMessage);
        panel.add(years);
        panel.add(calculate);
        
    }
    
    
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text;
            double input;
            double monthlyRf;
            
            text = years.getText();
            input = Double.parseDouble(text);
            
            if (input < 1) {
                String wrongValue = JOptionPane.showInputDialog("Enter a number greater than " +
                                            "one.");
                input = Integer.parseInt(wrongValue);
            }
            
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < 12; j++) {
                    String value = JOptionPane.showInputDialog("Enter the number of inches it rained " + 
                            "in the current month");
                    monthlyRf = Integer.parseInt(value);
                    annualRf += monthlyRf;
                }   
            }
            
            double months = input * 12;
            double total = annualRf * input;
            double averageRf = total / months;
            
            JOptionPane.showMessageDialog(null, "Number of months: " + months + 
                        " Total Rainfall(inches): " + total + " Average Rainfall: " +
                        averageRf);
            
        }
    }
    
    public static void main(String[] args) {
        new AverageRainfall();
    }
    
}
