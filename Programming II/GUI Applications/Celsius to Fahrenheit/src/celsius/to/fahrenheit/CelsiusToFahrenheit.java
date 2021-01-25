package celcius.to.fahrenheit;
import javax.swing.*;
import java.awt.event.*;



public class CelsiusToFahrenheit extends JFrame{
    private JLabel instructions;
    private JTextField input;
    private JButton calculate;
    private JPanel panel;
    
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 100;
    
    public CelsiusToFahrenheit() {
        setTitle("Celcius to Fahrenheit Converter");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        add(panel);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }
    
    public void buildPanel() {
        instructions = new JLabel("Enter the temperature in Celcius");
        input = new JTextField(5);
        calculate = new JButton("Convert to Fahrenheit");
        
        calculate.addActionListener(new CalcButtonListener());
        
        panel = new JPanel();
        
        panel.add(instructions);
        panel.add(input);
        panel.add(calculate);
    }

    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String temp;
            double celsius;
            double fahrenheit;
            
            temp = input.getText();
            celsius = Integer.parseInt(temp);
            
            fahrenheit = (celsius * 9 / 5) + 32;
            
            JOptionPane.showMessageDialog(null, "That is " + fahrenheit + " degrees fahrenheit.");
            
        }
    }
    
    public static void main(String[] args) {
        new CelsiusToFahrenheit();
        
    }
    
}
