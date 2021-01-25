package mystack;
import java.io.*;

public class MyStack{

    
    public static void main(String[] args) throws IOException  {
        Stack stackOne = new Stack();
        PrintWriter outputFile = new PrintWriter("out.txt");
        
        for (int i = 0; i < 5; i++) {
            stackOne.push(10 * i);
        }
        
        for (int j = 0; j < 5; j++) {
            if (stackOne.testStack(1)) {
                double pops = stackOne.pop();
                
                outputFile.println(pops);
                
            }
            
        }
        outputFile.close();
    }
    
}
