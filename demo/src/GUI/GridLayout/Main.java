package GUI.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;

public class Main {

  public static void main(String[] args) {

    // Layout Manager = Defines the natural layout for components within a container

    // FlowLayout = Places components in a row, sized at their preferred size.
    //              If the horizontal space in the container is too small,
    //              the FlowLayout class uses the next available row.

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800,300);
    frame.setLayout(new GridLayout(3,3,10,10));
    frame.setVisible(true);

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    frame.add(button0);
    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);
    frame.add(button6);
    frame.add(button7);
    frame.add(button8);
    frame.add(button9);
    
    // Uneven number of buttons
    JButton button10 = new JButton("10");
    frame.add(button10);
    // It will create a new column and it tries to distribute the buttons
    // as evenly as possible

  }
  
}
