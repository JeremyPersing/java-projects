package fileencryption;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws IOException {
	    char [] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        initialWrite("regular.dat", arr);
        encryption("regular.dat", "encrypted.dat");
        decryption("encrypted.dat", "decrypted.dat");

    }

    public static void initialWrite(String fileName, char[] arr) throws IOException{
        RandomAccessFile fileOne = new RandomAccessFile(fileName, "rw");
        for (int i = 0; i < arr.length; i++) {
            fileOne.writeChar(arr[i]);
        }
        fileOne.close();
    }

    public static void encryption(String fileNameOne, String fileNameTwo) throws IOException {
        RandomAccessFile fileOne = new RandomAccessFile(fileNameOne, "r");
        System.out.println(Math.toIntExact(fileOne.length()));
        char [] initialArray = new char[(Math.toIntExact(fileOne.length())) / 2];   //Need to divide by 2 because giving twice the amount that are in character array above
        boolean endOfFile = false;
        int i = 0;
        while (!endOfFile) {
            try {
                initialArray[i] = fileOne.readChar();
                i++;
            }
            catch (EOFException e) {
                endOfFile = true;
            }
        }
        fileOne.close();

        RandomAccessFile fileTwo = new RandomAccessFile(fileNameTwo, "rw");
        for (int j = 0; j < initialArray.length; j++) {
            System.out.println(initialArray[j] + 10);
            fileTwo.writeChar(initialArray[j] + 10);
        }
        fileTwo.close();
    }

    public static void decryption(String fileNameOne, String fileNameTwo) throws IOException{
        RandomAccessFile fileOne = new RandomAccessFile(fileNameOne, "r");
        System.out.println((Math.toIntExact(fileOne.length())));
        char [] initialArray = new char[(Math.toIntExact(fileOne.length())) / 2];
        boolean endOfFile = false;
        int i = 0;
        while (!endOfFile) {
            try {
                initialArray[i] = fileOne.readChar();
                i++;
            }
            catch (EOFException e) {
                endOfFile = true;
            }
        }
        fileOne.close();

        RandomAccessFile fileTwo = new RandomAccessFile(fileNameTwo, "rw");
        for (int j = 0; j < initialArray.length; j++) {
            System.out.println(initialArray[j] - 10);
            fileTwo.writeChar(initialArray[j] - 10);
        }
        fileTwo.close();
    }
}
