package exception_handling;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // exception = an event that occurs during the execution
    // of a program that disrupts the normal flow of instructions
    
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.println("Enter a whole number to divide: ");
      int x = scanner.nextInt();

      System.out.println("Enter whole a number to divide by: ");
      int y = scanner.nextInt();
      
      System.out.println(x + " divided by " + y + " is: " + x/y);

    } catch (ArithmeticException e) {

      System.out.println("Cannot divide by zero");

    } catch (Exception e) {

      System.out.println("Something went wrong");

    } finally {

      scanner.close();

    }
  }

  
}
