package GUI.DragAndDrop;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

  // Attaching the DragPanel to the frame
  DragPanel panel = new DragPanel();
  
  MyFrame(){
    this.setTitle("Drag and Drop");
    this.add(panel);
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
