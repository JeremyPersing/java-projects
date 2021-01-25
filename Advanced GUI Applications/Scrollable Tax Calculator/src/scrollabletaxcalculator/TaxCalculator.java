package scrollabletaxcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TaxCalculator extends JFrame {
    private JPanel panel;
    private JSlider slider;
    private JLabel purchase;
    private JTextField purchaseAmount;
    private JButton calculate;

    public TaxCalculator() {
        setTitle("Tax Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);

        setVisible(true);
    }

    public JPanel buildPanel() {
        panel = new JPanel();
        slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        purchase = new JLabel("Enter the amount of your purchase");
        purchaseAmount = new JTextField(10);
        calculate = new JButton("Calculate Tax");
        calculate.addActionListener(new CalculateTax());

        panel.add(purchase);
        panel.add(purchaseAmount);
        panel.add(slider);
        panel.add(calculate);
        return panel;
    }

    private class CalculateTax implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DecimalFormat dollarFormat = new DecimalFormat("#0.00");
            double tax = slider.getValue();
            String initialPurchase = purchaseAmount.getText();
            double initPurchase = Double.parseDouble(initialPurchase);
            double taxAmount = (tax * initPurchase) / 100;
            JOptionPane.showMessageDialog(null, "The sales tax is $" + dollarFormat.format(taxAmount));

        }
    }

    public static void main(String[] args) {
        new TaxCalculator();
    }
}
