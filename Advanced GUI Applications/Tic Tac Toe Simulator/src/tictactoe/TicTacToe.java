package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class TicTacToe extends JFrame {
    private JPanel panel, imagePanel , buttonPanel;
    private JButton newGame, exit;
    private ImageIcon x, o;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    public void buildImagePanel() {
        imagePanel = new JPanel();
        setLayout(new GridLayout(3, 3));
    }

    public void buildButtonPanel() {
        buttonPanel = new JPanel();
        newGame = new JButton("New Game");
        exit = new JButton("Exit");
        buttonPanel.add(newGame);
        buttonPanel.add(exit);
    }

    public void buildPanel() {
        buildImagePanel();
        buildButtonPanel();
        panel = new JPanel();

    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int [][] arr = new int[3][3];

        }
    }


    public static void main(String[] args) {
	    //new TicTacToe();
	    int row = 4;
	    int col = 4;
        int [][] arr = new int[3][3];
        int [][] bigArr = {{2,3,4}, {3,4,5}};
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = rand.nextInt(2);
            }
        }
        for (int h = 0; h < arr.length; h++) {
            System.out.println(Arrays.toString(arr[h]));
        }
    }
}
