package file.encryption.filter;
import java.io.*;
import java.util.Scanner;

public class FileEncryptionFilter {

    
    public static void main(String[] args) throws IOException{
        getUnencrypted();
        
        FileInputStream istream = new FileInputStream("unencrypted.dat");
        DataInputStream inputFile = new DataInputStream(istream);
        
        String preEncryption = inputFile.readUTF();
        
        System.out.println("The file input is: " + preEncryption);
        inputFile.close();
        
        FileOutputStream fileStream = new FileOutputStream("encrypted.dat");
        DataOutputStream outFile = new DataOutputStream(fileStream);
        
        char pre[] = preEncryption.toCharArray();
        
        for (int i = 0; i < pre.length; i++) {
            outFile.writeChar(pre[i] + 10);
        }
        
        System.out.println("Data has been encrytpted");
        outFile.close();
        
        
    }
    
    public static void getUnencrypted() throws IOException{
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str = keyboard.nextLine();
        
        FileOutputStream fstream = new FileOutputStream("unencrypted.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);
        
        outputFile.writeUTF(str);
        
        System.out.println("The string has been inserted in the file");
        outputFile.close();
    }
}
