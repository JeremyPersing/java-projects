package skateboard.designer;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class Decks extends JPanel implements ListSelectionListener{
    private JPanel deckPanel;
    private JList decks; 
    public static int deckSelected;
    String[] decksArray = {"The Master Thrasher $60", "The Dictator $45",
        "The Street King $50"};
    
    public Decks() {
        setBorder(BorderFactory.createTitledBorder("Decks"));
        
        decks = new JList(decksArray);
        
        add(decks);
        
        decks.setVisibleRowCount(1);
        decks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        decks.addListSelectionListener(this);
        
        setLayout(new GridLayout(2,1));
    }

    public void valueChanged(ListSelectionEvent e) {
        deckSelected = 0;
        if (!e.getValueIsAdjusting()) {
            
            if(!decks.isSelectionEmpty()) {
                
                if (decks.isSelectedIndex(0)) {
                deckSelected += 60;
                }
                if (decks.isSelectedIndex(1)) {
                    deckSelected += 45;
                }
                if (decks.isSelectedIndex(2)) {
                    deckSelected += 50;
                }

            }

            
        }
    }
}
