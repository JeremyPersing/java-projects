/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.head.display;

import java.util.Scanner;
import java.io.*;


/**
 *
 * @author Jeremy
 */
public class FileHeadDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the file name");
        String filename = keyboard.nextLine();
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        int numberOfLines = 1;
        
        while (inputFile.hasNext() && numberOfLines <= 5) {
            System.out.println(inputFile.nextLine());
            numberOfLines++;
        }
        
        inputFile.close();
        

        
    }
    
}
