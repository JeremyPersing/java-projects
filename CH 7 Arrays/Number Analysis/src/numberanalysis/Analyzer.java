package numberanalysis;
import java.io.*;
import java.util.*;

public class Analyzer {
    private ArrayList<Double> arr = new ArrayList<>();
    public Analyzer(File file) throws FileNotFoundException {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            numbers.add(Double.parseDouble(s.nextLine()));
        }
        arr = numbers;
        System.out.println(arr);
    }


    public void lowestNumber() {
        double lowest = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < lowest) {
                lowest = arr.get(i);
            }
        }
        System.out.println("Lowest Number: " + lowest);
    }

    public void highestNumber() {
        double highest = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > highest) {
                highest = arr.get(i);
            }
        }
        System.out.println("Highest Number: " + highest);
    }

    public void getTotal() {
        double total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        System.out.println("Total: " + total);
    }

    public void getAverage() {
        double average = 0;
        for (int i = 0; i < arr.size(); i++) {
            average += arr.get(i);
        }
        System.out.println("Average: " + (average / arr.size()));
    }

}
