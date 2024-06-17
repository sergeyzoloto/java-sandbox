package GUI.JColorChooser;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener {
  
  JButton button;
  JLabel label;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    label = new JLabel();
    label.setFont(new Font("MV Boli", Font.PLAIN, 100));
    label.setBackground(Color.WHITE);
    label.setText("This is some text");
    this.add(label);

    button = new JButton("Select Color");
    button.addActionListener(this);
    this.add(button);
    
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {
      Color color = JColorChooser.showDialog(null, "Select a color", Color.BLACK);
      this.getContentPane().setBackground(color);
    }
  }
  
}
