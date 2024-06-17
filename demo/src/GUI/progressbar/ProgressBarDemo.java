package GUI.progressbar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {

  JFrame frame;
  JProgressBar progressBar;

  ProgressBarDemo() {

    // Create a new instance of JFrame
    frame = new JFrame();

    // Create a new instance of JProgressBar
    progressBar = new JProgressBar();

    // Set the minimum value of the progress bar
    progressBar.setMinimum(0);

    // Set the maximum value of the progress bar
    progressBar.setMaximum(100);

    // Set the current value of the progress bar
    progressBar.setValue(0);

    // Set the string to be displayed on the progress bar
    progressBar.setStringPainted(true);

    // Add the progress bar to the frame
    frame.add(progressBar);

    // Set the bounds of the progress bar
    progressBar.setBounds(100, 100, 200, 50);



    // Set the layout of the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(null);
    frame.setVisible(true);

    fill();

  }

  public void fill() {
    int counter = 100;
    while (counter >= 0) {
      progressBar.setValue(counter);
      try {
        // Set the current value of the progress bar
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      counter -= 1;
    }
    System.out.println("Progress bar filled");
    // Close the frame
    frame.dispose();
  }
  
}
