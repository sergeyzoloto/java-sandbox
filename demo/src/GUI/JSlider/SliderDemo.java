package GUI.JSlider;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SliderDemo extends JFrame implements ChangeListener {
  
  JSlider slider;
  JLabel label;
  
  SliderDemo() {
    
    // Create a new instance of JSlider
    slider = new JSlider(0, 100, 50);
    
    // Set the orientation of the slider
    slider.setOrientation(SwingConstants.VERTICAL);
    
    // Set the minor tick spacing
    slider.setMinorTickSpacing(10);
    
    // Set the major tick spacing
    slider.setMajorTickSpacing(20);
    
    // Set the paint ticks
    slider.setPaintTicks(true);
    
    // Set the paint labels
    slider.setPaintLabels(true);
    
    // Add a change listener to the slider
    slider.addChangeListener(this);
    
    // Create a new instance of JLabel
    label = new JLabel();
    
    // Set the text of the label
    label.setText("°C: " + slider.getValue());
    
    // Add the slider and label to the frame
    this.add(slider, BorderLayout.CENTER);
    this.add(label, BorderLayout.SOUTH);
    
    // Set the layout of the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setVisible(true);
  }
  
  @Override
  public void stateChanged(ChangeEvent e) {
    // Get the value of the slider
    label.setText("°C: " + slider.getValue());
  }
  
}