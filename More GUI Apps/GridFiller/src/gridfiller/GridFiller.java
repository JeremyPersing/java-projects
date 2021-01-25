package gridfiller;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class GridFiller extends JFrame{
    private JPanel panel;
    private JPanel [] panels;
    private JButton [] buttons;


    public GridFiller() {
        setTitle("Grid Filler");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        buildPanel();
        addMouseListener(new MyMouseListener());
        add(panel);
        setVisible(true);
    }

    private void buildPanel() {
        panel = new JPanel();
        panels = new JPanel[16];
        buttons = new JButton[16];
        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            panels[i] = new JPanel();

        }
        for (int j = 0; j < panels.length; j++) {
            panels[j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            panel.add(panels[j]);
        }

    }



    private class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            getGraphics().fillArc(e.getX(), e.getY(), 25, 25, 0, 360);
        }

    }

    public static void main(String[] args) {
        new GridFiller();
    }

}
