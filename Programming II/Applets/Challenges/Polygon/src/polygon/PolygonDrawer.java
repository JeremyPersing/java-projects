package polygon;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class PolygonDrawer extends JApplet {
    private ArrayList<Integer> xCoords = new ArrayList<>();
    private ArrayList<Integer> yCoords = new ArrayList<>();
    private int[] xPts = new int[6];
    private int[] yPts = new int[6];
    private int clicks = 0;
    
    
    public void init() { 
        getContentPane().setBackground(Color.white);
        addMouseListener(new myMouseListener());
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        if (clicks == 6) {
            for (int i = 0; i < 6; i++) {
                xPts[i] = xCoords.get(i);
                yPts[i] = yCoords.get(i);
            }
            g.fillPolygon(xPts, yPts, 6);
        }
    }
    
    
    private class myMouseListener extends MouseAdapter {
          public void mouseClicked(MouseEvent e) {
                xCoords.add(e.getX());
                yCoords.add(e.getY());
                clicks++;
                
                System.out.print(xCoords);
                repaint();
        }
    }
    
   
}
