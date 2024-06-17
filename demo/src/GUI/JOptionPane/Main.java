package GUI.JOptionPane;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

    // JOptionPane = pop-up that contains a message
    //               and returns a value based on user clicks

    // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
    // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
    // JOptionPane.showMessageDialog(null, "Really?", "Title", JOptionPane.QUESTION_MESSAGE);
    // JOptionPane.showMessageDialog(null, "You've been warned", "Title", JOptionPane.WARNING_MESSAGE);
    // JOptionPane.showMessageDialog(null, "Call the police", "Title", JOptionPane.ERROR_MESSAGE);

    // int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
    // String name = JOptionPane.showInputDialog("What is your name?");
    // System.out.println("Hello " + name);

    String[] responses = {"No, you're awesome!", "Thank you!", "*blushes*", "You're breathtaking!"};
    int response = JOptionPane.showOptionDialog(null, "You are awesome!", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    System.out.println(responses[response]);
  }
  
}
