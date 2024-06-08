import java.util.Scanner;

public class MathClass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x, y, z;
    System.out.println("This program calculates the hypotenuse of a right triangle.");

    System.out.print("Enter the first side: ");
    x = scanner.nextDouble();
    System.out.print("Enter the second side: ");
    y = scanner.nextDouble();

    z = Math.sqrt(x * x + y * y);
    System.out.println("The hypotenuse is " + z);

    scanner.close();
  }
}
