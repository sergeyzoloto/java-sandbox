import java.util.Scanner;
import java.util.Random;

public class Conditional {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    if (x > y) {
      System.out.println("x is greater than y");
    } else if (x < y) {
      System.out.println("x is less than y");
    } else {
      System.out.println("x is equal to y");
    }

    // Ternary operator
    String result = (x > y) ? "x is greater than y" : "x is less than or equal to y";
    System.out.println(result);

    // Switch statement
    // The switch statement is that allows a variable to be tested for equality against a list of values
    // The break statement is used to exit the switch statement

    int day = 4;
    String dayString;

    switch (day) {
      case 1:
        dayString = "Monday";
        break;
      case 2:
        dayString = "Tuesday";
        break;
      case 3:
        dayString = "Wednesday";
        break;
      case 4:
        dayString = "Thursday";
        break;
      case 5:
        dayString = "Friday";
        break;
      case 6:
        dayString = "Saturday";
        break;
      case 7:
        dayString = "Sunday";
        break;
      default:
        dayString = "Invalid day";
        break;
    }

    System.out.println("The day is " + dayString);

    // Logical operators
    // && (logical AND): Returns true if both statements are true

    int temp = 25;

    if (temp > 30) {
      System.out.println("It's hot outside");
    } else if (temp >= 20 && temp <= 30) {
      System.out.println("It's warm outside");
    } else {
      System.out.println("It's cold outside");
    }


    // || (logical OR): Returns true if one of the statements is true
    Scanner scanner = new Scanner(System.in);
    System.out.print("You are playing a game! Press q or Q to quit: ");
    String response = scanner.next();

    if (response.equals("q") || response.equals("Q")) {
      System.out.println("You quit the game");
    } else {
      System.out.println("You are still playing the game");
    }

    // ! (logical NOT): Reverse the result, returns false if the result is true
    boolean isRaining = false;

    Random random = new Random();
    isRaining = random.nextBoolean();

    if (!isRaining) {
      System.out.println("You don't need to carry an umbrella");
    } else {
      System.out.println("You need to carry an umbrella");
    }

    scanner.close();

  }

}
