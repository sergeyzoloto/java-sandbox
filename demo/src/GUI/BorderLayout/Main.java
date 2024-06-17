package GUI.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class Main {

  public static void main(String[] args) {

    // Layout Manager = Defines the natural layout for components within a container

    // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
    //               All extra space is placed in the CENTER area

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setVisible(true);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    panel1.setBackground(Color.RED);
    panel2.setBackground(Color.GREEN);
    panel3.setBackground(Color.BLUE);
    panel4.setBackground(Color.YELLOW);
    panel5.setBackground(Color.ORANGE);

    panel1.setPreferredSize(new Dimension(100,100));
    panel2.setPreferredSize(new Dimension(100,100));
    panel3.setPreferredSize(new Dimension(100,100));
    panel4.setPreferredSize(new Dimension(100,100));
    panel5.setPreferredSize(new Dimension(100,100));

    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.SOUTH);
    frame.add(panel3, BorderLayout.WEST);
    frame.add(panel4, BorderLayout.EAST);
    frame.add(panel5, BorderLayout.CENTER);

  }
  
}
