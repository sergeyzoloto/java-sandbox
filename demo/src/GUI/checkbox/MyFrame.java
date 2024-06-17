package GUI.checkbox;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{

  JButton button;
  JCheckBox checkBox;
  ImageIcon xIcon;
  ImageIcon checkIcon;

  MyFrame() {
    
    xIcon = new ImageIcon("demo/src/GUI/checkbox/x.png");
    checkIcon = new ImageIcon("demo/src/GUI/checkbox/check.png");

    checkBox = new JCheckBox();
    checkBox.setBounds(100,100,150,150);
    checkBox.setIcon(xIcon);
    checkBox.setSelectedIcon(checkIcon);
    this.add(checkBox);

    button = new JButton("Submit");
    button.setBounds(100,250,100,50);
    button.addActionListener(this);
    this.add(button);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(null);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button) {
      System.out.println(checkBox.isSelected());
      this.dispose();
    }
  }

}