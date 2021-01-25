package testscores;

import java.io.Serializable;

public class InvalidTestScore extends Exception {
    public InvalidTestScore() {
        super("Invalid input");
    }
}
