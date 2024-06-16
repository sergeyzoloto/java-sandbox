package GUI.panels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main {

  public static void main(String[] args) {

    // JPanel = a GUI component that functions as a container to hold other components

    ImageIcon icon = new ImageIcon("demo/src/GUI/labels/icon.png");

    JLabel label = new JLabel(); // Create a new label
    
    label.setText("Hi, welcome to my program!"); // Set the text of the label
    label.setIcon(icon); // Set the icon of the label
    label.setVerticalAlignment(JLabel.CENTER); // Set the vertical alignment of the label to center
    label.setHorizontalAlignment(JLabel.CENTER); // Set the horizontal alignment of the label to center
    label.setBounds(100, 100, 250, 250); // Set the bounds of the label (x, y, width, height)

    JPanel redPanel = new JPanel(); // Create a new panel
    redPanel.setBackground(Color.RED); // Set the background color of the panel
    redPanel.setBounds(0, 0, 250, 250); // Set the bounds of the panel (x, y, width, height)
    redPanel.setLayout(null); // Set the layout of the panel to null

    JPanel bluePanel = new JPanel(); // Create a new panel
    bluePanel.setBackground(Color.BLUE); // Set the background color of the panel
    bluePanel.setBounds(250, 0, 250, 250); // Set the bounds of the panel (x, y, width, height)
    bluePanel.setLayout(null); // Set the layout of the panel to null

    JPanel greenPanel = new JPanel(); // Create a new panel
    greenPanel.setBackground(Color.GREEN); // Set the background color of the panel
    greenPanel.setBounds(0, 250, 500, 250); // Set the bounds of the panel (x, y, width, height)
    greenPanel.setLayout(null); // Set the layout of the panel to null

    JFrame frame = new JFrame(); // Create a new JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation of the frame
    frame.setLayout(null); // Set the layout of the frame to null
    frame.setSize(750, 750); // Set the size of the frame
    frame.setVisible(true); // Set the visibility of the frame to true
    greenPanel.add(label); // Add the label to the green panel 
    frame.add(redPanel); // Add the red panel to the frame
    frame.add(bluePanel); // Add the blue panel to the frame
    frame.add(greenPanel); // Add the green panel to the frame
  }
  
}
