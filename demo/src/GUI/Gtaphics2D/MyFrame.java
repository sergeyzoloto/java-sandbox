package GUI.Gtaphics2D;

import javax.swing.*;

public class MyFrame extends JFrame{

  MyPanel panel;
  
  public MyFrame() {

    panel = new MyPanel();
    this.add(panel);

    this.pack();
    this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.setTitle("Graphics2D");
    this.setLocationRelativeTo(null); // center the window
    this.setVisible(true);
  }


}
