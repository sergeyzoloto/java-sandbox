package GUI.radiobuttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

  JRadioButton pizzaButton;
  JRadioButton burgerButton;
  JRadioButton hotdogButton;

  MyFrame() {

    // Create a new instance of JRadioButton
    pizzaButton = new JRadioButton("pizza");
    burgerButton = new JRadioButton("burger");
    hotdogButton = new JRadioButton("hotdog");

    // You can also set the icons for the radio buttons
    // ImageIcon pizzaIcon = new ImageIcon("pizza.png");
    // ImageIcon burgerIcon = new ImageIcon("burger.png");
    // ImageIcon hotdogIcon = new ImageIcon("hotdog.png");

    // Create a new instance of ButtonGroup
    ButtonGroup group = new ButtonGroup();

    // Add the radio buttons to the group
    group.add(pizzaButton);
    group.add(burgerButton);
    group.add(hotdogButton);

    // Add the radio buttons to the frame
    this.add(pizzaButton);
    this.add(burgerButton);
    this.add(hotdogButton);

    // Add an action listener to the radio buttons
    pizzaButton.addActionListener(this);
    burgerButton.addActionListener(this);
    hotdogButton.addActionListener(this);
    
    // Set the layout of the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(new FlowLayout());
    this.setVisible(true);
    this.pack();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==pizzaButton) {
      System.out.println("Pizza ordered");
      this.dispose();
    }
    if (e.getSource()==burgerButton) {
      System.out.println("Burger ordered");
      this.dispose();      
    }
    if (e.getSource()==hotdogButton) {
      System.out.println("Hotdog ordered");
      this.dispose();      
    }
  }

}