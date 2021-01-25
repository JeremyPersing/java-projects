package population;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math.*;


public class Population extends JFrame{
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 200;
    private JPanel panel;
    private JLabel organisms;
    private JLabel populationIncrease;
    private JLabel days;
    private JTextField organismsTextField;
    private JTextField populationTextField;
    private JTextField daysTextField;
    private JButton calculateButton;
    
    public Population() {
        setTitle("Population Calculator");
        
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        add(panel);
        setVisible(true);
    }
    
    public void buildPanel() {
        panel = new JPanel();
        
        organisms = new JLabel("Enter the number of starting organisms");
        organismsTextField = new JTextField(10);
        
        populationIncrease = new JLabel("What percentage is the growth rate");
        populationTextField = new JTextField(10);
        
        days = new JLabel("How many days will the virus last");
        daysTextField = new JTextField(10);
        
        calculateButton = new JButton("Calculate Population Growth");
        calculateButton.addActionListener(new CalcButtonListener());
        
        panel.add(organisms);
        panel.add(organismsTextField);
        panel.add(populationIncrease);
        panel.add(populationTextField);
        panel.add(days);
        panel.add(daysTextField);
        panel.add(calculateButton);      
    }
    
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            String startingO = organismsTextField.getText();
            double startingOrganisms = Double.parseDouble(startingO);
            if (startingOrganisms < 2) {
                JOptionPane.showMessageDialog(null, "Enter a number greater than 2");
            }
            
            
            String pop = populationTextField.getText();
            double popPercentage = Double.parseDouble(pop);
            if (popPercentage <= 0) {
                JOptionPane.showMessageDialog(null, "Enter a number greater than 0");
            }
            
            String dias = daysTextField.getText();
            double time = Double.parseDouble(dias);
            if (time < 1) {
                JOptionPane.showMessageDialog(null, "Enter a number greater than 1");
            }
            
            double totalPopulation = 0;
            
            
            for (int i = 0; i < time; i++) {
                popPercentage = popPercentage / 100;
                double initial = (1.0 + popPercentage);
                double multiplier = Math.pow(initial, (i));
                totalPopulation = startingOrganisms * multiplier;
                System.out.println(totalPopulation);
            }
                
                
            
            
            JOptionPane.showMessageDialog(null, totalPopulation);
        }
    }
    
    public static void main(String[] args) {
        new Population();
    }
    
}
