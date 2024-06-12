package classes;

public class Car {

  String make = "Chevrolet";
  String model = "Camaro";
  int year = 2022;
  String color = "black";
  double price = 25000.00;

  // toString() is a method that all objects inherit from the Object class
  // that returns a string representation of the object
  // We can override this method to return a custom string representation
  public String toString() {
    return String.format("I have a %d %s %s that is %s and costs $%,.2f%n", 
      year, make, model, color, price);
  }

  void drive() {
    System.out.println("You drive the car");
  }

  void brake() {
    System.out.println("You step on the brakes");
  }
}