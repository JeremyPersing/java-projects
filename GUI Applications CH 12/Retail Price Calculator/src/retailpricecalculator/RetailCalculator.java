package retailpricecalculator;
import javax.swing.*;
import java.awt.event.*;


public class RetailCalculator extends JFrame {
    private JPanel panel;
    private JButton calculate;
    private JTextField wholeSale;
    private JTextField markup;
    private JLabel markupPrice;
    private JLabel wholeSalePrice;

    public RetailCalculator() {
        setTitle("Retail Calculator");
        setSize(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);

        setVisible(true);
    }

    public JPanel buildPanel() {
        panel = new JPanel();
        markupPrice = new JLabel("Enter the markup percentage");
        wholeSalePrice = new JLabel(("Enter the whole sale price"));
        wholeSale = new JTextField(10);
        markup = new JTextField(10);
        calculate = new JButton("Calculate markup");

        calculate.addActionListener(new ButtonPressed());

        panel.add(wholeSalePrice);
        panel.add(wholeSale);
        panel.add(markupPrice);
        panel.add(markup);
        panel.add(calculate);

        return panel;
    }

    private class ButtonPressed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String originalPrice = wholeSale.getText();
            double price = Double.parseDouble(originalPrice);
            String markupPrice = markup.getText();
            double itemMarkupPercentage = (Double.parseDouble(markupPrice)) / 100;

            double retailPrice = price + (price * itemMarkupPercentage);
            JOptionPane.showMessageDialog(null, "The retail price of the item is " + retailPrice);

        }



    }



    public static void main(String[] args) {
        new RetailCalculator();
    }
}
