package passwordverifier;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter your password");

        PasswordVerifier userPassword = new PasswordVerifier(str);

        if (userPassword.meetsCriteria() && userPassword.meetsLength()) {
            JOptionPane.showMessageDialog(null, str + " is a valid password");
        }
        else {
            JOptionPane.showMessageDialog(null, str + " is an invalid password.");
        }
    }
}
