package numberanalysis;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        File nums = new File("C:\\Users\\Jeremy\\Desktop\\Java Projects\\CH 7 Arrays\\Number Analysis\\numbers.txt");
        Analyzer fileOne = new Analyzer(nums);

        fileOne.highestNumber();
        fileOne.lowestNumber();
        fileOne.getAverage();
        fileOne.getTotal();

    }
}
