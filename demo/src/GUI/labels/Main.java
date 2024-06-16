package GUI.labels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.BorderFactory;

public class Main {
  
  public static void main(String[] args) {
    
    // JLabel = a GUI display area for a string of text, an image, or both

    ImageIcon image = new ImageIcon("demo/src/GUI/labels/image.jpg");
    Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

    JLabel label = new JLabel(); // Create a new label
    label.setText("Hi, welcome to my program!"); // Set the text of the label
    label.setIcon(image); // Set the icon of the label
    label.setHorizontalTextPosition(JLabel.CENTER); // Set the text position of the label to center
    label.setVerticalTextPosition(JLabel.TOP); // Set the text position of the label to top
    label.setIconTextGap(25); // Set the gap of the text and the icon
    label.setVerticalAlignment(JLabel.CENTER); // Set the vertical alignment of the label to center
    label.setHorizontalAlignment(JLabel.CENTER); // Set the horizontal alignment of the label to center
    label.setForeground(new Color(0x00FF00)); // Set the foreground color of the label
    label.setBackground(Color.BLACK); // Set the background color of the label
    label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set the font of the label (font name, style, size
    label.setIconTextGap(0); // Set the gap 
    label.setOpaque(true); // Set the opacity of the label
    label.setBorder(border); // Set the border of the label
    //label.setBounds(100, 100, 1000, 500); // Set the bounds of the label (x, y, width, height)
    label.setVisible(true); // Set the visibility of the label

    JFrame frame = new JFrame(); // Create a new JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation of the frame
    frame.setVisible(true);
    //frame.setSize(1030, 520); // Set the size of the frame
    //frame.setLayout(null); // Set the layout of the frame to null
    frame.add(label); // Add the label to the frame 

    frame.pack(); // Set the size of the frame to fit the size of the components
  }
}
