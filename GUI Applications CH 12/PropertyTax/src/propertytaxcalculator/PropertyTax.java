package propertytaxcalculator;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class PropertyTax extends JFrame {
    private JPanel panel;
    private JTextField actualValue;
    private JLabel value;
    private JButton calculateButton;

    public PropertyTax() {
        setTitle("Property Tax Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    public JPanel buildPanel() {
        panel = new JPanel();
        value = new JLabel("Enter the Actual value of your real estate");
        actualValue = new JTextField(10);
        calculateButton = new JButton("Calculate Property Tax");
        calculateButton.addActionListener(new CalcButtonListener());

        panel.add(value);
        panel.add(actualValue);
        panel.add(calculateButton);
        return panel;
    }

    public class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actualValueText = actualValue.getText();
            Double value = Double.parseDouble(actualValueText);

            value *= .00384;
            JOptionPane.showMessageDialog(null, "The property tax for your property is " + value);

        }
    }
    public static void main(String[] args) {
	    new PropertyTax();
    }
}
