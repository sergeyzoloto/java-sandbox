import java.util.Scanner;

public class Loops {
  
  public static void main(String[] args) {
    // while loop = repeats a block of code while a condition is true

    Scanner scanner = new Scanner(System.in);
    String name = "";

    while (name.isBlank()) {
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }

    System.out.println("Hello, " + name);

    // do while loop = repeats a block of code once, then repeats it while a condition is true

    String age = "";
    do {
      System.out.print("Enter your age: ");
      age = scanner.nextLine();
    } while (age.isBlank());

    System.out.println("Your age " + age);

    // for loop = repeats a block of code a limited amount of times

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // nested loops = a loop inside of a loop

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i = " + i + " j = " + j);
      }
    }

    scanner.close();
  }
}
