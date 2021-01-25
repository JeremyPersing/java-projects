/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.age.annual.income;

/**
 *
 * @author Jeremy
 */
public class NameAgeAnnualIncome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        double annualPay;
        
        name = "Jeremy Persing";
        age = 18;
        annualPay = 100000;
        
        System.out.println("My name is " + name + ", my age is " + age + 
                           " and I hope to earn $" + annualPay + " per year.");
    }
    
}
