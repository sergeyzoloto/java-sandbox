package GUI.KeyListener;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements KeyListener{
  
  JLabel label;

  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);


    label = new JLabel();
    label.setBounds(0, 0, 100, 100);
    label.setOpaque(true);
    label.setBackground(java.awt.Color.RED);
    
    this.add(label);
    this.addKeyListener(this);
    this.setFocusable(true);
    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {

    // getKeyChar() returns the character that was typed

    switch (e.getKeyChar()) {
      case 'a':
        label.setLocation(label.getX()-10, label.getY());
        break;
      case 'w':
        label.setLocation(label.getX(), label.getY()-10);
        break;
      case 'd':
        label.setLocation(label.getX()+10, label.getY());
        break;
      case 's':
        label.setLocation(label.getX(), label.getY()+10);
        break;
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {

    // getKeyCode() returns the integer code associated with the key pressed

    switch(e.getKeyCode()){
      case 37:
        label.setLocation(label.getX()-10, label.getY());
        break;
      case 38:
        label.setLocation(label.getX(), label.getY()-10);
        break;
      case 39:
        label.setLocation(label.getX()+10, label.getY());
        break;
      case 40:
        label.setLocation(label.getX(), label.getY()+10);
        break;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("Key Released");
    System.out.println("You released key char: " + e.getKeyChar());
    System.out.println("You released key code: " + e.getKeyCode());
  }

}
