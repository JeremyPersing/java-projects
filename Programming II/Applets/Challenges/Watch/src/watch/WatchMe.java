package watch;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class WatchMe extends JApplet {
    private boolean normal = true;
    private boolean fillAbove, fillRight, fillBelow, fillLeft = false;
    
    private int currentX;
    private int currentY;
    public void init() {
        getContentPane().setBackground(Color.white);
        addMouseMotionListener(new myMotionListener());
    }

    public void paint(Graphics g) {
        super.paint(g);  
        g.setColor(Color.black);
        drawEyes(g);
        
        if (normal) {
            drawNormal(g);
        }
        if (fillAbove) {
            drawAbove(g);
        }
        if (fillRight) {
            drawRight(g);
        }
        if (fillBelow) {
            drawBelow(g);
        }
        if (fillLeft) {
            drawLeft(g);
        }
        
    }
    
    private boolean isMouseAbove(int y) {
        boolean status = false;
        if (y < 60) {
            status = true;
        }
        return status;
    }
    
    private boolean isMouseRight(int x, int y) {
        boolean status = false;
        
        if (x > 210 && y < 140 && y > 60) {
            status = true;
        }
        
        return status;
    }
    
    private boolean isMouseBelow(int y) {
        boolean status = false;
        
        if (y > 140) {
            status = true;
        }
        return status;
    }
    
    private boolean isMouseLeft(int x, int y) {
        boolean status = false;
        
        if (x < 110 && y < 140 && y > 60) {
            status = true;
        }
        return status;
    }
    
    private boolean isMouseOnEyes(int x, int y) {
        boolean status = false;
        if (x > 110 && x < 210 && y < 140 && y > 60) {
            status = true;
        }
        return status;
    }


    public void clearFlags() {
        normal = false;
        fillAbove = false; 
        fillRight = false;
        fillBelow = false;
        fillLeft = false;
    }
    
    private class myMotionListener extends MouseMotionAdapter{
        
        public void mouseMoved(MouseEvent e) {
           currentX = e.getX();
           currentY = e.getY();
           
           clearFlags();
           if (isMouseAbove(currentY)) {  
               fillAbove = true;
           }
           if (isMouseRight(currentX, currentY)) {
               fillRight = true;             
           }
           if (isMouseBelow(currentY)) {
               fillBelow = true;
           }
           if (isMouseLeft(currentX, currentY)) {
               fillLeft = true;
           }
           if (isMouseOnEyes(currentX, currentY)) {
               normal = true;
           }
           repaint();
        }        
    }

    
    public void drawEyes(Graphics g) {
        g.drawOval(110, 60, 40, 80);
        g.drawOval(160, 60, 40, 80);
        
    }
    
    public void drawNormal(Graphics g) {    
        g.fillOval(118, 90, 25, 25);
        g.fillOval(168, 90, 25, 25);  
            
    }
    
    public void drawAbove(Graphics g) {
        g.fillOval(118, 70, 25, 25);
        g.fillOval(168, 70, 25, 25);     
    }
    
    public void drawBelow(Graphics g) {
        g.fillOval(118, 110, 25, 25);
        g.fillOval(168, 110, 25, 25);
    }
    
    public void drawRight(Graphics g) {
        g.fillOval(128, 90, 25, 25);
        g.fillOval(178, 90, 25, 25);
    }
    
    public void drawLeft(Graphics g) {
        g.fillOval(108, 90, 25, 25);
        g.fillOval(158, 90, 25, 25);
    }
    
}
