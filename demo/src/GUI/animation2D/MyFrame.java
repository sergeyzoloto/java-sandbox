package GUI.animation2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

  MyPanel panel;

  MyFrame() {

    panel = new MyPanel();
    this.add(panel);
    this.setTitle("2D Animation");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }
  
}
