package testscores;
import java.io.*;

public class TestScoreSerialization extends Exception implements Serializable {
    protected TestScores [] arr;

    public TestScoreSerialization(TestScores one, TestScores two, TestScores three, TestScores four, TestScores five) {
        arr = new TestScores[] {one, two, three, four, five};
    }

    public void serializeObjects(String fileName) throws IOException {
        FileOutputStream fStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fStream);

        for (int i = 0; i < arr.length; i++) {
            objectOutput.writeObject(arr[i]);
        }
        objectOutput.close();
        System.out.println("Done");
    }

    public void deSerializeObject(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        ObjectInputStream objectInput = new ObjectInputStream(inputStream);
        TestScores [] deserialized = new TestScores[5];

        boolean endOfFile = false;
        int i = 0;
        while (!endOfFile) {
            try {
                deserialized[i] = (TestScores) objectInput.readObject();
                i++;
            }
            catch (EOFException | ClassNotFoundException e) {
                endOfFile = true;
            }
        }
        objectInput.close();
        System.out.println("Deserialized");
    }
}
