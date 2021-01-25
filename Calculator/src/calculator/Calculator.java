package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Calculator extends JFrame{
    private JPanel mainPanel, buttonPanel, mainFeatures;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, clearEverything, backSpace, add, subtract, divide, multiply, equals, dot;
    private JTextArea area;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 700);

        mainPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        mainPanel.setLayout(borderLayout);
        area = new JTextArea(2, 25);
        area.setFont(area.getFont().deriveFont(40f));
        area.setEditable(true);
        buildButtonPanel();
        mainPanel.add(area, borderLayout.NORTH);
        mainPanel.add(mainFeatures, borderLayout.EAST);
        mainPanel.add(buttonPanel, borderLayout.CENTER);
        add(mainPanel);
        setVisible(true);
    }

    public void buildButtonPanel() {
        buttonPanel = new JPanel();
        mainFeatures = new JPanel();
        GridLayout gridLayout = new GridLayout(4, 4);
        GridLayout main = new GridLayout(2, 1);
        buttonPanel.setLayout(gridLayout);
        mainFeatures.setLayout(main);


        // Creating Buttons
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        clearEverything = new JButton("C/E");
        backSpace = new JButton("←");
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("÷");
        equals = new JButton("=");
        dot = new JButton(".");

        // Adding action listeners to the buttons
        one.addActionListener(new ButtonListener());
        two.addActionListener(new ButtonListener());
        three.addActionListener(new ButtonListener());
        four.addActionListener(new ButtonListener());
        five.addActionListener(new ButtonListener());
        six.addActionListener(new ButtonListener());
        seven.addActionListener(new ButtonListener());
        eight.addActionListener(new ButtonListener());
        nine.addActionListener(new ButtonListener());
        zero.addActionListener(new ButtonListener());
        add.addActionListener(new ButtonListener());
        subtract.addActionListener(new ButtonListener());
        divide.addActionListener(new ButtonListener());
        multiply.addActionListener(new ButtonListener());
        dot.addActionListener(new ButtonListener());
        equals.addActionListener(new ButtonListener());
        backSpace.addActionListener(new ButtonListener());
        clearEverything.addActionListener(new ButtonListener());

        buttonPanel.add(one);
        buttonPanel.add(two);
        buttonPanel.add(three);
        buttonPanel.add(dot);
        buttonPanel.add(four);
        buttonPanel.add(five);
        buttonPanel.add(six);
        buttonPanel.add(backSpace);
        buttonPanel.add(seven);
        buttonPanel.add(eight);
        buttonPanel.add(nine);
        buttonPanel.add(add);
        buttonPanel.add(multiply);
        buttonPanel.add(divide);
        buttonPanel.add(zero);
        buttonPanel.add(subtract);
        mainFeatures.add(clearEverything);
        mainFeatures.add(equals);

    }


    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            if (e.getSource() == one) {
                area.append("1");
            }
            else if (e.getSource() == two) {
                area.append("2");
            }
            else if (e.getSource() == three) {
                area.append("3");
            }
            else if (e.getSource() == four) {
                area.append("4");
            }
            else if (e.getSource() == five) {
                area.append("5");
            }
            else if (e.getSource() == six) {
                area.append("6");
            }
            else if (e.getSource() == seven) {
                area.append("7");
            }
            else if (e.getSource() == eight) {
                area.append("8");
            }
            else if (e.getSource() == nine) {
                area.append("9");
            }
            else if (e.getSource() == zero) {
                area.append("0");
            }
            else if (e.getSource() == clearEverything) {
                area.setText("");
            }
            else if (e.getSource() == backSpace) {
                String originalStr = area.getText();
                char [] ogStr = originalStr.toCharArray();
                char [] newStr = new char[ogStr.length - 1];

                for (int i = 0; i < ogStr.length - 1; i++) {
                    newStr[i] = ogStr[i];
                }
                String backSpaced = new String(newStr);
                area.setText("");
                area.append(backSpaced);
            }
            else if (e.getSource() == dot) {
                area.append(".");
            }
            else if (e.getSource() == add) {
                area.append("+");
            }
            else if (e.getSource() == subtract) {
                area.append("-");
            }
            else if (e.getSource() == multiply) {
                area.append("*");
            }
            else if (e.getSource() == divide) {
                area.append("÷");
            }
            else if (e.getSource() == equals) {
                String text = area.getText();
                char [] arr = text.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == '+') {
                        int plusPosition = i;
                        char[] firstNum = Arrays.copyOfRange(arr, 0, plusPosition);
                        char[] secondNum = Arrays.copyOfRange(arr, plusPosition + 1, arr.length);
                        String numOne = new String(firstNum);
                        String numTwo = new String(secondNum);
                        double num1 = Double.parseDouble(numOne);
                        double num2 = Double.parseDouble(numTwo);
                        double sum = num1 + num2;
                        area.setText("");
                        area.append(Double.toString(sum));
                    }
                    else if (arr[i] == '-') {
                        String numOne, numTwo;
                        double num1, num2, difference;
                        int minusPosition = i;
                        char [] firstNum = Arrays.copyOfRange(arr, 0, minusPosition);
                        char [] secondNum = Arrays.copyOfRange(arr, minusPosition + 1, arr.length);

                        numOne = new String(firstNum);
                        numTwo = new String(secondNum);
                        num1 = Double.parseDouble(numOne);
                        System.out.println(num1);
                        num2 = Double.parseDouble(numTwo);
                        System.out.println(num2);
                        difference = num1 - num2;
                        area.setText("");
                        area.append(Double.toString(difference));
                    }

                    else if (arr[i] == '*') {
                        int multiplyPosition = i;
                        char [] firstNum = Arrays.copyOfRange(arr, 0, multiplyPosition);
                        char [] secondNum = Arrays.copyOfRange(arr, multiplyPosition + 1, arr.length);
                        String numOne = new String(firstNum);
                        String numTwo = new String(secondNum);
                        double num1 = Double.parseDouble(numOne);
                        double num2 = Double.parseDouble(numTwo);
                        double product = num1 * num2;
                        area.setText("");
                        area.append(Double.toString(product));
                    }
                    else if (arr[i] == '÷') {
                        int dividePosition = i;
                        char [] firstNum = Arrays.copyOfRange(arr, 0, dividePosition);
                        char [] secondNum = Arrays.copyOfRange(arr, dividePosition + 1, arr.length);
                        String numOne = new String(firstNum);
                        String numTwo = new String(secondNum);
                        double num1 = Double.parseDouble(numOne);
                        double num2 = Double.parseDouble(numTwo);
                        double quotient = num1 / num2;
                        area.setText("");
                        area.append(Double.toString(quotient));
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
