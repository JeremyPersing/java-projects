package dice.simulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class DiceSimulator extends JFrame{
    private JPanel imagePanelOne;
    private JPanel imagePanelTwo;
    private JPanel buttonPanel;
    private JButton roll;
    private JLabel labelOne;
    private JLabel labelTwo;
    
    public DiceSimulator() {
        setTitle("Dice Simulator");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        buildImagePanelOne();
        buildImgagePanelTwo();
        buildButtonPanel();
        
        add(imagePanelOne, BorderLayout.WEST);
        add(imagePanelTwo, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void buildImagePanelOne() {
        imagePanelOne = new JPanel();
        
        labelOne = new JLabel();
        imagePanelOne.add(labelOne);
    }
    
    private void buildImgagePanelTwo() {
        imagePanelTwo = new JPanel();
        
        labelTwo = new JLabel();
        imagePanelTwo.add(labelTwo);
    }
    
    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        
        roll = new JButton("Roll the Dice");
        
        roll.addActionListener(new ButtonListener());
        
        buttonPanel.add(roll);
        
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            
            int numOne = rand.nextInt(6);
            numOne += 1;
            
            int numTwo = rand.nextInt(6);
            numTwo += 1;
            
            ImageIcon one = new ImageIcon("Die1.png");
            ImageIcon two = new ImageIcon("Die2.png");
            ImageIcon three = new ImageIcon("Die3.png");
            ImageIcon four = new ImageIcon("Die4.png");
            ImageIcon five = new ImageIcon("Die5.png");
            ImageIcon six = new ImageIcon("Die6.png");
            
            if (numOne == 1) {
                labelOne.setIcon(one);
            }
            if (numOne == 2) {
                labelOne.setIcon(two);
            }
            if (numOne == 3) {
                labelOne.setIcon(three);
            }
            if (numOne == 4) {
                labelOne.setIcon(four);
            }
            if (numOne == 5) {
                labelOne.setIcon(five);
            }
            if (numOne == 6) {
                labelOne.setIcon(six);
            }
            
            if (numTwo == 1) {
                labelTwo.setIcon(one);
            }
            if (numTwo == 2) {
                labelTwo.setIcon(two);
            }
            if (numTwo == 3) {
                labelTwo.setIcon(three);
            }
            if (numTwo == 4) {
                labelTwo.setIcon(four);
            }
            if (numTwo == 5) {
                labelTwo.setIcon(five);
            }
            if (numTwo == 6) {
                labelTwo.setIcon(six);
            }
            
            pack();
        }
    }
    
    public static void main(String[] args) {
        new DiceSimulator();
    }
    
}
