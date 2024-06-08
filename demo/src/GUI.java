// Import JOptionPane class from javax.swing package
import javax.swing.JOptionPane;

// Create a class for Graphical User Interface
public class GUI {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name: ");
    JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
    JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm: "));
    JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
  }
}
