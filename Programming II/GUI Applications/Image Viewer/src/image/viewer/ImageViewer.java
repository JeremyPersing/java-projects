package image.viewer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class ImageViewer extends JFrame{
    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JLabel imageLabel;
    private JButton button;
    private JFileChooser fileChooser;
    
    public ImageViewer() {
        setTitle("Image Viewer");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        buildImagePanel();
        buildButtonPanel();
        
        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        fileChooser = new JFileChooser(" ");
        pack();
        setVisible(true);
    }
    
    private void buildImagePanel() {
        imagePanel = new JPanel();
        
        imageLabel = new JLabel("Click the button to get an image");
        
        imagePanel.add(imageLabel);
    }

    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        
        button = new JButton("Get image");
        
        button.addActionListener(new ButtonListener());
        
        buttonPanel.add(button);
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            File selectedFile;
            ImageIcon image;
            String fileName;
            int fileChooserStatus;
            
            fileChooserStatus = fileChooser.showOpenDialog(ImageViewer.this);
            
            if (fileChooserStatus == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                
                fileName = selectedFile.getPath();
                
                image = new ImageIcon(fileName);
                
                imageLabel.setIcon(image);
                
                imageLabel.setText(null);
                
                pack();
            }
        }
    }
    
    public static void main(String[] args) {
        new ImageViewer();
    }
    
}
