package followme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FollowMe extends JFrame {
    private int WIDTH = 500;
    private int HEIGHT = 500;
    private int X = WIDTH / 2;
    private int Y = HEIGHT / 2;
    private JPanel panel;

    public FollowMe() {
        setTitle("Follow Me");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        panel = new JPanel();
        panel.addMouseMotionListener(new MyMouseMotionListener());
        add(panel);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        getGraphics().drawString("Hello", X, Y);
    }

    private class MyMouseMotionListener extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent e) {
            X = e.getX();
            Y = e.getY();
            getGraphics().drawString("Hello", X, Y);
            repaint();
        }
    }

    public static void main(String[] args) {
        new FollowMe();
    }
    
}
