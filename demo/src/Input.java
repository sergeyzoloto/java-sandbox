import java.util.Scanner;

public class Input {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    
    scanner.nextLine(); // handle next line character (enter key, \n)

    System.out.println("What is your favorite food: ");
    String food = scanner.nextLine(); // called after nextInt()

    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("You like " + food);

    scanner.close();
  }

}
