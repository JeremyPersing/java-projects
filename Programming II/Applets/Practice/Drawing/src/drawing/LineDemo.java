package drawing;
import javax.swing.*;
import java.awt.*;



public class LineDemo extends JApplet {

    
    public void init() {
        getContentPane().setBackground(Color.white);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.red);
        g.drawRect(20, 20, 120, 120);
        
        g.setColor(Color.blue);
        g.fillRect(160, 160, 120, 120);
        
    }
}
