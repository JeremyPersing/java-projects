package stopwatch;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class StopWatch extends JFrame {
    private JPanel panel, buttonPanel;
    private JButton stop, start, reset;
    private Timer time;
    private double elapsedTime = 0;
    private JLabel label;

    public StopWatch() {
        setTitle("Stopwatch");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);

    }

    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        start = new JButton("Start");
        stop = new JButton("Stop");
        reset = new JButton("Reset");
        time = new Timer(1, new TimerListener());
        start.addActionListener(new ButtonListener());
        stop.addActionListener(new ButtonListener());
        reset.addActionListener(new ButtonListener());
        buttonPanel.add(start);
        buttonPanel.add(stop);
        buttonPanel.add(reset);
    }

    private void buildPanel() {
        buildButtonPanel();
        panel = new JPanel();
        label = new JLabel();
        panel.add(buttonPanel);
        panel.add(label);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == start) {
                time.start();
            }
            if (e.getSource() == stop) {
                time.stop();
            }
            if (e.getSource() == reset) {
                elapsedTime = 0;
            }
        }
    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DecimalFormat good = new DecimalFormat("##############################.##");
            elapsedTime += .002;
            String timeElapsed = good.format(elapsedTime);
            label.setText("Time elapsed: " + timeElapsed);
        }
    }


    public static void main(String[] args) {
        new StopWatch();
    }
}
