package classes;

public class Scopes {

  public static void main(String[] args) {
    // local variable = variable declared inside a method
    // they are only accessible within the method

    // global variable = variable declared outside a method
    // they are accessible from any method in the class

    DiceRoller diceRoller = new DiceRoller();

    // System.out.println(diceRoller.number); // error
    // System.out.println(number); // error
    diceRoller.roll();
  }
}