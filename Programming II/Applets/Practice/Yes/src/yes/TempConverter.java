package yes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class TempConverter extends JApplet {
    private JPanel fPanel;
    private JPanel cPanel;
    private JPanel buttonPanel;
    private JTextField fahrenheit;
    private JTextField celsius;
    
    public void init() {
        buildFpanel();
        buildCpanel();
        buildButtonPanel();
        
        setLayout(new GridLayout(3,1));
        
        add(fPanel);
        add(cPanel);
        add(buttonPanel);
    }

    private void buildFpanel() {
        fPanel = new JPanel();
        
        JLabel message1 = new JLabel("Enter a temperature in Fahrenheit");
        
        fahrenheit = new JTextField(10);
        
        fPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        fPanel.add(message1);
        fPanel.add(fahrenheit);
    }
    
    private void buildCpanel() {
        cPanel = new JPanel();
        
        JLabel message2 = new JLabel("Celsius");
        
        celsius = new JTextField(10);
        celsius.setEditable(false);
        
        cPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        cPanel.add(message2);
        cPanel.add(celsius);
    }
    
    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        
        JButton calculate = new JButton("Calculate");
        
        calculate.addActionListener(new ButtonListener());
        
        buttonPanel.add(calculate);
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double cTemp, fTemp;
            
            DecimalFormat formatter = new DecimalFormat("0.0");
            
            fTemp = Double.parseDouble(fahrenheit.getText());
            
            cTemp = (5.0/9.0) * (fTemp - 32);
            
            celsius.setText(formatter.format(cTemp));
        }
    }
}
