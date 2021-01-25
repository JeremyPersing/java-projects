package skateboarddesigner;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

public class SkateboardDesigner extends JFrame {
    private JPanel mainPanel, deckPanel, truckPanel, wheelPanel, additionalPanel;
    private JList decks;
    private JComboBox wheels, trucks;
    private JButton calculate;
    private JCheckBox tape, bearings, riserPads, nuts;
    private double deckPrice, truckPrice, wheelPrice, miscPrice;

    public SkateboardDesigner() {
        setTitle("Skateboard Designer");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildMainPanel();
        add(mainPanel);
        setVisible(true);
    }

    //Building of panels
    public void buildDeckPanel() {
        String [] decksAvailable = {"The Master Thrasher $60", "The Dictator $45", "The Street King $50"};
        deckPanel = new JPanel();
        decks = new JList(decksAvailable);
        decks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        deckPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        deckPanel.add(decks);
    }

    public void buildTruckPanel() {
        String [] truckAssemblies = {"7.75 inch axle $35", "8 inch axle $40", "8.5 inch axle $45"};
        truckPanel = new JPanel();
        trucks = new JComboBox(truckAssemblies);
        truckPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        truckPanel.add(trucks);
    }

    public void buildWheelPanel() {
        String [] arr = {"51 mm $20", "55 mm $22", "58 mm $24", "61 mm $28"};
        wheelPanel = new JPanel();
        wheels = new JComboBox(arr);
        wheelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        wheelPanel.add(wheels);
    }

    public void buildAdditionalPanel() {
        tape = new JCheckBox("Grip Tape: $10");
        bearings = new JCheckBox("Bearings: $30");
        riserPads = new JCheckBox("Riser Pads: $2");
        nuts = new JCheckBox("Nuts & Bolts Kit: $3");
        additionalPanel = new JPanel();
        tape.addItemListener(new CheckBoxListener());
        bearings.addItemListener(new CheckBoxListener());
        riserPads.addItemListener(new CheckBoxListener());
        nuts.addItemListener(new CheckBoxListener());

        additionalPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        additionalPanel.add(tape);
        additionalPanel.add(bearings);
        additionalPanel.add(riserPads);
        additionalPanel.add(nuts);
    }

    public void buildMainPanel() {
        buildDeckPanel();
        buildTruckPanel();
        buildWheelPanel();
        buildAdditionalPanel();
        mainPanel = new JPanel();
        calculate = new JButton("Calculate Price");
        calculate.addActionListener(new CalcButtonListener());
        mainPanel.add(deckPanel);
        mainPanel.add(truckPanel);
        mainPanel.add(wheelPanel);
        mainPanel.add(additionalPanel);
        mainPanel.add(calculate);
    }

    private class CheckBoxListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == tape) {
                miscPrice += 10;
            }
            if (e.getSource() == bearings) {
                miscPrice += 30;
            }
            if (e.getSource() == riserPads) {
                miscPrice += 2;
            }
            if (e.getSource() == nuts) {
                miscPrice += 3;
            }
            
        }
    }

    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DecimalFormat dollarFormat = new DecimalFormat("#0.00");
            int deckIndex = decks.getSelectedIndex();
            if (deckIndex == 0) {
                deckPrice = 60;
            }
            else if (deckIndex == 1) {
                deckPrice = 45;
            }
            else if (deckIndex == 2) {
                deckPrice = 50;
            }
            else {
                JOptionPane.showMessageDialog(null, "You forgot to select decks");
            }

            int truckIndex = trucks.getSelectedIndex();
            if (truckIndex == 0) {
                truckPrice = 35;
            }
            else if (truckIndex == 1) {
                truckPrice = 40;
            }
            else if (truckIndex == 2) {
                truckPrice = 45;
            }
            else {
                JOptionPane.showMessageDialog(null, "You forgot to select trucks");
            }

            int wheelIndex = wheels.getSelectedIndex();
            if (wheelIndex == 0) {
                wheelPrice = 20;
            }
            else if (wheelIndex == 1) {
                wheelPrice = 22;
            }
            else if (wheelIndex == 2) {
                wheelPrice = 24;
            }
            else if (wheelIndex == 3) {
                wheelPrice = 28;
            }
            else {
                JOptionPane.showMessageDialog(null, "You forgot to select wheels");
            }
            double subTotal = deckPrice + truckPrice + wheelPrice + miscPrice;
            double tax = subTotal * .06;
            double total = subTotal + tax;
            JOptionPane.showMessageDialog(null, "Subtotal: $" + dollarFormat.format(subTotal) +
                                            "\nTax: $" + dollarFormat.format(tax) + "\nTotal: $" +
                                            dollarFormat.format(total));

        }
    }


    public static void main(String[] args) {
	    new SkateboardDesigner();
    }
}
