package mpthree;
import java.io.*;
import org.apache.*;
import org.xml.sax.*;

public class Main {

    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Jeremy\\Desktop\\Java Projects\\Mp3 files";
    }

    public static void getData(String file) {
        try {
            InputStream input = new FileInputStream(new File(file));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
