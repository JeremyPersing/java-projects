package skateboard.designer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class SkateboardDesigner extends JFrame {
//    Deck Component
    private Decks deck;
    public static int deckSelected;
//    Truck Component
    private TrucksPanel trucks;
    public static int trucksSelected;
//    Wheel Component
    private WheelsPanel wheels;
    public static int wheelsSelected;
//    Misc Component
    private MiscPanel misc;
    public static int miscSelected;
//    Button Components
    private JPanel buttonPanel;
    private JButton totalButton;
//    Price Components
    private double subtotal;
    private double total;
    private double tax;
    

    
    public SkateboardDesigner() {
        setTitle("Skateboard Designer");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        setSize(200, 200);
        
        setLayout(new GridLayout(3,4));
        
        deck = new Decks();
        trucks = new TrucksPanel();
        wheels = new WheelsPanel();
        misc = new MiscPanel();
        buildButtonPanel();
        
        add(deck);
        add(trucks);
        add(wheels);
        add(misc);       
        add(buttonPanel);

        
        pack();
        setVisible(true);
    }
    
    
    
//    Button and Button Panel
    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        
        totalButton = new JButton("Calculate Total");
        
        totalButton.addActionListener(new ButtonListener());
        buttonPanel.add(totalButton);
    }

    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DecimalFormat dollar = new DecimalFormat("0.00");
            SkateboardDesigner.deckSelected = Decks.deckSelected;
            SkateboardDesigner.trucksSelected = TrucksPanel.trucksSelected;
            SkateboardDesigner.wheelsSelected = WheelsPanel.wheelsSelected;
            SkateboardDesigner.miscSelected = MiscPanel.miscSelected;
            
            subtotal = deckSelected + wheelsSelected + trucksSelected + miscSelected;
            
            tax = subtotal * .06;
            
            total = subtotal + tax;
            
            JOptionPane.showMessageDialog(null, "Subtotal: $" + dollar.format(subtotal) + " Tax: $" +
                                dollar.format(tax) + " Total: $" + dollar.format(total));
        }
    }
    
    public static void main(String[] args) {
       new SkateboardDesigner();
    }
    
}
