package GUI.newWindow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

  JFrame frame = new JFrame();
  JLabel label = new JLabel("Hello");

  NewWindow() {
    label.setBounds(0,0,100,50);
    label.setOpaque(true);
    label.setFont(new java.awt.Font("Verdana", 0, 25));
    frame.add(label);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
  }
  
}
