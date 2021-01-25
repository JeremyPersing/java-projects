package practice;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        final String DB_URL = "jdbc:derby:Practice;create=true";

        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE Employee (" +
                    "Id Integer NOT NULL PRIMARY KEY," +
                    "Name CHAR(25), Position CHAR(25), PayRate DOUBLE");

            stmt.execute("INSERT INTO Employee (Id, Name, Position, PayRate) VALUES ('1234', 'John Sewer'" +
                    "'Busboy', '11.00')");

        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
