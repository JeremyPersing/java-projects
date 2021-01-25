package dice.game;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class DiceGame extends JFrame {
    private JPanel panel;
    private JButton startButton;
    private JLabel instructions;
    private int computerCount = 0;
    private int playerCount = 0;

    public DiceGame() {
        setTitle("Dice Game");
        
        setSize(400, 150);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        add(panel);
        
        setVisible(true);
    }
    
    
    public void buildPanel() {
        panel = new JPanel();
        instructions = new JLabel("Click the button to see if you are luckier than the computer");
        startButton = new JButton("Roll the Dice");
        
        startButton.addActionListener(new CalcButtonListener());
        
        panel.add(instructions);
        panel.add(startButton);
        
    }
    
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {                
                
            for (int i = 0; i < 10; i++) {  
                Random randomOne = new Random();
                Random randomTwo = new Random();

                int dieOne = randomOne.nextInt(6) + 1;
                System.out.print("DieOne: " + dieOne);
                int dieTwo = randomTwo.nextInt(6) + 1;
                System.out.println("Die Two: " + dieTwo);
                
                if (dieOne < dieTwo) {
                    computerCount += 1;
                }
                if (dieOne > dieTwo) {
                    playerCount += 1;
                }
                if (dieOne == dieTwo) {
                    playerCount += 0;
                    computerCount += 0;
                }      
                
                System.out.println("PC " + playerCount);
                System.out.println("CC " + computerCount);
            }
            
            if (playerCount < computerCount) {
                JOptionPane.showMessageDialog(null, "Sorry, You lost" + 
                        "\nComputer Total: " + computerCount + "\nYour Total: " +
                            playerCount);
            }
            if (computerCount < playerCount) {
                JOptionPane.showMessageDialog(null, "Congratulations! You won" + 
                        "\nYour Total: " + playerCount + "\nComputer Total: " + computerCount);
            }
            if (computerCount == playerCount) {
                JOptionPane.showMessageDialog(null, "A tie occurred" + "\nYour Total: " 
                        + playerCount + "\nComputer Total: " + computerCount);
            }
        }
    }
    public static void main(String[] args) {
        new DiceGame();
    }
    
}
