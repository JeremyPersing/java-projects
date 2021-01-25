package joes.automotive;
import javax.swing.*;
import java.awt.*;

public class Message extends JPanel{
    private JLabel message;
    
    public Message() {
        setLayout(new GridLayout(1,1));
        message = new JLabel("Click the options needed. If you need a nonroutine service done " +
                                    "enter the price of the part in the field.");
        add(message);
    }
}
