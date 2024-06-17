package GUI.textfield;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

  JTextField textField = new JTextField();
  JButton button = new JButton("Submit");
  
  MyFrame() {
    
    textField.setBounds(50,50,300,30);
    textField.addActionListener(this);
    textField.setText("Enter your name");
    textField.setFont(new Font("Consolas", Font.PLAIN, 35));
    textField.setForeground(java.awt.Color.GREEN);
    textField.setBackground(java.awt.Color.BLACK);
    textField.setEditable(true);
    this.add(textField);

    button.setBounds(50,100,80,30);
    button.addActionListener(this);
    this.add(button);
    
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button) {
      System.out.println("Welcome " + textField.getText());
      // Close the window
      this.dispose();
    }
  }

}