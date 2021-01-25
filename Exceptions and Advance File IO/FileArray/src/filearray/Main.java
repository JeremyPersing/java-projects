package filearray;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        int [] arrOne = {2, 3, 4, 5, 6};
        int [] arrTwo = new int[arrOne.length];
        writeArray("binaryInfo.dat", arrOne);
        readArray("binaryinfo.dat", arrTwo);
    }

    public static void writeArray(String fileName, int [] arr) throws IOException{
        RandomAccessFile fileOne = new RandomAccessFile(fileName, "rw");
        for (int i = 0; i < arr.length; i++) {
            fileOne.writeInt(arr[i]);
        }
        fileOne.close();
    }

    public static void readArray(String fileName, int [] arr) throws IOException {
        RandomAccessFile fileOne = new RandomAccessFile(fileName, "r");
        boolean endOfFile = false;
        int i = 0;
        while (!endOfFile) {
            try {
                arr[i] = fileOne.readInt();
                System.out.println(arr[i]);
                i++;
            }
            catch (EOFException e) {
                endOfFile = true;
            }
        }
        fileOne.close();

    }
}
