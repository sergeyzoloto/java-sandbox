package GUI.JFileChooser;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
  
  JButton button;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Select File");
    button.addActionListener(this);

    this.add(button);
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File("."));
      int response = fileChooser.showOpenDialog(null);

      if(response == JFileChooser.APPROVE_OPTION) {
        System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
      }
    }
  }
}
