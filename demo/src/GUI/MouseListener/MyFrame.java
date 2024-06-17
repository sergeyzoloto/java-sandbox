package GUI.MouseListener;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener{
  
  JLabel label;

  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.setVisible(true);

    label = new JLabel();
    label.setBounds(0, 0, 100, 100);
    label.setOpaque(true);
    label.setBackground(Color.RED);
    label.addMouseListener(this);

    this.add(label);

  }

  @Override
  public void mouseClicked(MouseEvent e) {
    // mouseClicked() is called when the mouse is clicked
    // getX() returns the x-coordinate of the mouse
    // getY() returns the y-coordinate of the mouse
    System.out.println("Mouse Clicked");
    System.out.println("X: " + e.getX() + " Y: " + e.getY());
    label.setBackground(Color.BLUE);
  }

  @Override
  public void mousePressed(MouseEvent e) {
    // mousePressed() is called when the mouse is pressed
    System.out.println("Mouse Pressed");
    label.setBackground(Color.GREEN);
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // mouseReleased() is called when the mouse is released
    System.out.println("Mouse Released");
    label.setBackground(Color.RED);
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // mouseEntered() is called when the mouse enters the component
    System.out.println("Mouse Entered");
    label.setBackground(Color.ORANGE);
  }

  @Override
  public void mouseExited(MouseEvent e) {
    // mouseExited() is called when the mouse exits the component
    System.out.println("Mouse Exited");
    label.setBackground(Color.YELLOW);
  }

}
