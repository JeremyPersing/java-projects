package dorm.and.meal.calculator;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DormAndMealCalculator extends JFrame{
    private JComboBox housing;
    private JComboBox mealPlans;
    private JPanel panel;
    private String[] housingOptions = {"Allen Hall: $1,500 per semester", "Pike Hall: " +
            "$1,600 per semester", "Farthing Hall: $1,200 per semester", "University Suites: " +
            "$1,800 per semester"};
    private String[] mealPlanOptions = {"7 meals per week: $560 per semester", "14 meals per " + 
            "weel: $1,095 per semester", "Unlimited meals: $1,500 per semester"};
    private int housingCost = 0;
    private int mealCost = 0;
    
    public DormAndMealCalculator() {
        setTitle("Dorm and Meal Plan Calculator");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        
        add(panel);
        pack();
        setVisible(true);
    }
    
    private void buildPanel() {
        panel = new JPanel();
        
        housing = new JComboBox(housingOptions);
        mealPlans = new JComboBox(mealPlanOptions);
        
        housing.addActionListener(new ComboBoxListener());
        mealPlans.addActionListener(new ComboBoxListener());
        
        panel.add(housing, BorderLayout.WEST);
        panel.add(mealPlans, BorderLayout.EAST);
    }
    
    
    private class ComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           int indexOne = housing.getSelectedIndex();
           String selectedHousing = housingOptions[indexOne];
           
           int indexTwo = mealPlans.getSelectedIndex();
           String selectedMealPlan = mealPlanOptions[indexTwo];
           
           if (selectedHousing.equals(housingOptions[0])) {
               housingCost = 1500;
           }
           if (selectedHousing.equals(housingOptions[1])) {
               housingCost = 1600;
           }
           if (selectedHousing.equals(housingOptions[2])) {
               housingCost = 1200;
           }
           if (selectedHousing.equals(housingOptions[3])) {
               housingCost = 1800;
           }
           
           if (selectedMealPlan.equals(mealPlanOptions[0])) {
               mealCost = 560;
           }
           if (selectedMealPlan.equals(mealPlanOptions[1])) {
               mealCost = 1095;
           }
           if (selectedMealPlan.equals(mealPlanOptions[2])) {
               mealCost = 1500;
           }
           
           JOptionPane.showMessageDialog(null, "Housing: $" + housingCost + "\nMeal Plan: $" + 
                   mealCost + "\nTotal: $" + (housingCost + mealCost));
        }
    }
    public static void main(String[] args) {
        new DormAndMealCalculator();
    }
    
}
