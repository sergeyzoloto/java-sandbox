package GUI.combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
  
  JComboBox comboBox;
  
  MyFrame() {
    
    // Create a new instance of JComboBox
    String[] food = {"pizza", "burger", "hotdog"};

    comboBox = new JComboBox(food);
    
    // Set the default selected item
    comboBox.setSelectedIndex(0);
    
    // Add an action listener to the combo box
    comboBox.addActionListener(this);
    
    // Add the combo box to the frame
    this.add(comboBox);
    
    // Set the layout of the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(new FlowLayout());
    this.setVisible(true);

    System.out.println("Amount of items: " + comboBox.getItemCount());

    // Add an item to the combo box
    comboBox.addItem("ice cream");
    System.out.println("Add an item to the combo box. New amount of items: " + comboBox.getItemCount());

    // Remove an item from the combo box
    comboBox.removeItem("burger");
    System.out.println("Remove an item from the combo box. New amount of items: " + comboBox.getItemCount());

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Get the selected item
    System.out.println("Selected item: " + comboBox.getSelectedItem());
  }
}
