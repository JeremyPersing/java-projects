package house;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HouseApplet extends JApplet {
    private boolean leftWindowOpen = true;
    private boolean rightWindowOpen = true;
    private boolean doorOpen = true;
    
    private final int WINDOW_WIDTH = 50;
    private final int WINDOW_HEIGHT = 50;
    private final int DOOR_WIDTH = 50;
    private final int DOOR_HEIGHT = 75;
    private final int LEFT_WINDOW_X = 75;
    private final int WINDOW_Y = 100;
    private final int RIGHT_WINDOW_X = 225;
    private final int DOOR_X = 150;
    private final int DOOR_Y = 100;
    
    
    
    public void init() {
        getContentPane().setBackground(Color.white);
        addMouseListener(new MyMouseListener());
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawHouse(g);
        
        if (!leftWindowOpen) {
            drawClosedWindow(g, LEFT_WINDOW_X, WINDOW_Y);
        }
        else {
            drawOpenWindow(g, LEFT_WINDOW_X, WINDOW_Y);
        }
        if (!rightWindowOpen) {
            drawClosedWindow(g, RIGHT_WINDOW_X, WINDOW_Y);
        }
        else {
            drawOpenWindow(g, RIGHT_WINDOW_X, WINDOW_Y);
        }
        if (!doorOpen) {
            drawClosedDoor(g, DOOR_X, DOOR_Y);
        }
        else {
            drawOpenDoor(g, DOOR_X, DOOR_Y);
        }
        
    }
    
    private void drawHouse(Graphics g) {
        g.drawRect(50, 75, 250, 100);
        
        g.drawLine(25, 75, 175, 25);
        g.drawLine(325, 75, 175, 25);
        g.drawLine(325, 75, 25, 75);
    }
    
    private void drawClosedWindow(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.drawRect(x, y, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.drawLine(x, (y+(WINDOW_HEIGHT/2)), (x + WINDOW_WIDTH), (y + (WINDOW_HEIGHT/2)));
        g.drawLine((x+(WINDOW_WIDTH/2)), (y + WINDOW_HEIGHT), (x + (WINDOW_WIDTH/2)), y);
    }
    
    private void drawClosedDoor(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.drawRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
        g.fillOval(188, 140, 10, 10);
    }
    
    private void drawOpenWindow(Graphics g, int x, int y) {
        g.fillRect(x, y, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
    
    private void drawOpenDoor(Graphics g, int x, int y) {
        g.fillRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
    }
    
    private class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            if (isInLeftWindow(e.getX(), e.getY())){
                leftWindowOpen = false;
            }
            if (isInRightWindow(e.getX(), e.getY())) {
                rightWindowOpen = false;
            }
            if (isInDoor(e.getX(), e.getY())) {
                doorOpen = false;
            }
            repaint();
        }
    }
    
    private boolean isInLeftWindow(int x, int y) {
        boolean status = false;
        
        if (x >= LEFT_WINDOW_X && x < (LEFT_WINDOW_X + WINDOW_WIDTH) &&
                y >= WINDOW_Y && y < (WINDOW_Y + WINDOW_HEIGHT)) {
            status = true;
        }
        return status;
    }
    
    private boolean isInRightWindow(int x, int y) {
        boolean status = false;
        if (x >= RIGHT_WINDOW_X && x < (RIGHT_WINDOW_X + WINDOW_WIDTH) &&
                y >= WINDOW_Y && y < (WINDOW_Y + WINDOW_HEIGHT)) {
            status = true;
        }
        return status;
    }
    
    private boolean isInDoor(int x, int y) {
        boolean status = false;
        if ((x >= DOOR_X) && (x < (DOOR_X + DOOR_WIDTH)) && (y >= DOOR_Y) 
                && (y < (DOOR_Y + DOOR_HEIGHT))) {
            status = true;
        }
        return status;
    }
}
