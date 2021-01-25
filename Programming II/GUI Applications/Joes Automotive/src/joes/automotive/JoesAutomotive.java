package joes.automotive;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class JoesAutomotive extends JFrame{
    
    private BoxPanel maintenance;         //Normal services
    private TextPanel additions;            //Additional services
    private Message intro;                  //Explains use of application
    private JPanel buttonPanel;                   //Holding panel
    private JButton calcButton;             //Calculates total price
    private JButton exitButton;             //Exits application

    
    public JoesAutomotive() {
        setTitle("Joe's Automotive Calcuator");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        maintenance = new BoxPanel();
        additions = new TextPanel();
        intro = new Message();
        
        buildButtonPanel();
        
        add(intro, BorderLayout.NORTH);
        add(maintenance, BorderLayout.WEST);
        add(additions, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);    
    }
    
    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        
        calcButton = new JButton("Calculate Total");
        exitButton = new JButton("Exit");
        
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());
        
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }
    
    private class CalcButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            DecimalFormat dollar = new DecimalFormat("#, ##0.00");
            
            double maintenancePrice = maintenance.getCost();
            double additionalPrice = additions.getAdditionalPrice();
            
            double totalCost = maintenancePrice + additionalPrice;
            
            JOptionPane.showMessageDialog(null, "The cost is " + "$" +
                                            dollar.format(totalCost));
        }
    }
    
    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new JoesAutomotive();
    }
    
}
