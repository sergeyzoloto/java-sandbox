package GUI.button;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{
  
  JButton button = new JButton("Click me");

  MyFrame() {

    button.setBounds(200, 100, 100, 40);
    button.setFocusable(false);
    button.addActionListener(this);

    this.add(button);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {
      System.out.println("Button clicked");
    }
  }
  
}
