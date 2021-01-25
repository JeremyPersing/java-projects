package passwordverifier;

import java.util.regex.Pattern;

public class PasswordVerifier {
    private String password;

    public PasswordVerifier(String str) {
        password = str;
    }

    public boolean meetsLength() {
        boolean meetsLength = false;
        int count = password.length();
        if (count >= 6) {
            meetsLength = true;
        }
        return meetsLength;
    }

    public boolean meetsCriteria() {
        boolean criteria = false;
        if (Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$",password)) {
            criteria = true;
        }

        return criteria;
    }
}
