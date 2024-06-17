package GUI.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
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
    frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
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

    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(300,300));
    panel.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
    panel.setBackground(Color.BLACK);


    panel.add(button0);
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel.add(button7);
    panel.add(button8);
    panel.add(button9);
    
    frame.add(panel);
    


  }
  
}
