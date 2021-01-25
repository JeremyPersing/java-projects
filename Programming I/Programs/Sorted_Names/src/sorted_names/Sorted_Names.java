/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorted_names;

import javax.swing.JOptionPane;
/**
 *
 * @author Jeremy
 */
public class Sorted_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        
        name1 = JOptionPane.showInputDialog("Enter a name");
        name2 = JOptionPane.showInputDialog("Enter another name");
        name3 = JOptionPane.showInputDialog("Enter a third and final name");
        
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
      
    }
    
}
