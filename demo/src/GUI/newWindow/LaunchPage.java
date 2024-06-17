package GUI.newWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

  JFrame frame = new JFrame();
  JButton button = new JButton("New Window");

  public LaunchPage() {
    button.addActionListener(this);

    button.setBounds(200,200,100,50);
    button.setFocusable(false);
    frame.add(button);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {
      frame.dispose();
      NewWindow newWindow = new NewWindow();
    }
  }
}
