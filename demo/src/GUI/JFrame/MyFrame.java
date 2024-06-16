package GUI.JFrame;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Color;

public class MyFrame extends JFrame{

  // JFrame is a GUI component that allows you to add other components to it.

  MyFrame() {
    // Set the default close operation of the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Prevent the frame from being resized
    this.setResizable(false);
    // Set the size of the frame
    this.setSize(500, 500);
    // Set the layout of the frame
    this.setLayout(new FlowLayout());
    // Set the visibility of the frame
    this.setVisible(true);

    // Create an ImageIcon
    ImageIcon image = new ImageIcon("demo/src/GUI/JFrame/image.jpg");
    // Set the icon of the frame
    this.setIconImage(image.getImage());

    this.getContentPane().setBackground(new Color(123, 50, 250));
  }
  
}
