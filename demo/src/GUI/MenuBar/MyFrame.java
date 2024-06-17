package GUI.MenuBar;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
  
  // MenuBar is a container for menus
  // Menu is a container for menu items
  // MenuItem can be selected by the user

  JMenuBar horizontalMenuBar;
  JMenu menu;
  JMenuItem menuItem1;
  JMenuItem menuItem2;
  JMenuItem menuItem3;


  MyFrame() {

    // Create a new instance of JFrame
    JFrame frame = new JFrame();

    // Create a new instance of JMenuBar
    horizontalMenuBar = new JMenuBar();

    // Create a new instance of JMenu
    menu = new JMenu("Menu");

    // Create a new instance of JMenuItem
    menuItem1 = new JMenuItem("Item 1");
    menuItem2 = new JMenuItem("Item 2");
    menuItem3 = new JMenuItem("Item 3");

    // Add the menu items to the menu
    menu.add(menuItem1);
    menu.add(menuItem2);
    menu.add(menuItem3);

    // Add an action listener to the menu items
    menuItem1.addActionListener(this);
    menuItem2.addActionListener(this);
    menuItem3.addActionListener(this);

    // Add keyboard shortcuts to the menu items
    menuItem1.setMnemonic(KeyEvent.VK_1);
    menuItem2.setMnemonic(KeyEvent.VK_2);
    menuItem3.setMnemonic(KeyEvent.VK_3);

    // Add the menu to the menu bar
    horizontalMenuBar.add(menu);

    // Add the menu bar to the frame
    frame.setJMenuBar(horizontalMenuBar);

    // Set the layout of the frame
    frame.setLayout(new FlowLayout());

    // Set the size of the frame
    frame.setSize(500, 500);

    // Set the default close operation of the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the visibility of the frame
    frame.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == menuItem1) {
      System.out.println("Item 1 selected");
    } else if(e.getSource() == menuItem2) {
      System.out.println("Item 2 selected");
    } else if(e.getSource() == menuItem3) {
      System.out.println("Item 3 selected");
    }
  }
}
