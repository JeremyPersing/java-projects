package translatelatin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TranslateLatin extends JFrame {
    private JButton sinister, dexter, medium;
    private JPanel panel;

    public TranslateLatin() {
        setTitle("Latin Translator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    public JPanel buildPanel() {
        panel = new JPanel();
        sinister = new JButton("Sinister");
        dexter = new JButton("Dexter");
        medium = new JButton("Medium");

        sinister.addActionListener(new ButtonTranslator());
        dexter.addActionListener(new ButtonTranslator());
        medium.addActionListener(new ButtonTranslator());
        panel.add(sinister);
        panel.add(medium);
        panel.add(dexter);
        return panel;
    }

    public class ButtonTranslator implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sinister) {
                JOptionPane.showMessageDialog(null, "English Translation: Left");
            }
            else if (e.getSource() == medium) {
                JOptionPane.showMessageDialog(null, "English Translation: Center");
            }
            else if (e.getSource() == dexter) {
                JOptionPane.showMessageDialog(null, "English Translation: Right");
            }
        }
    }

    public static void main(String[] args) {
        new TranslateLatin();
    }
}
