package world.series.champs;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
/**
 *
 * @author Jeremy
 */
public class WorldSeriesChamps {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        
//      Getting World Series File
        Scanner inFile = new Scanner(new File("C:\\Users\\Jeremy\\Desktop\\Java Projects\\WorldSeriesWinners.txt"));
//      String that will store contents of File
        String fileStrings = "";
        
        List<String> teams = new ArrayList<String>();
        
        
        while(inFile.hasNext()) {
            fileStrings = inFile.next();
            teams.add(fileStrings);
        }
        inFile.close();
        
//      Array holding the contents of the World Series File
        String [] teamArray = teams.toArray(new String[teams.size()]);
        
        System.out.println("Enter the name of a team and the amount of times that " +
                "have won the World Series will be outputted (If two words only enter the first word)");
        String input = keyboard.nextLine();
        
        int total = 0;
        for (int i = 0; i < teamArray.length; i++) {
            if (teamArray[i].equalsIgnoreCase(input)) {
                total += 1;
            }
        }
        
        System.out.println("The " + input + " have won " + total + " World Series.");
        }
        
        
    }


    
    

