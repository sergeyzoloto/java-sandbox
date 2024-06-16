package encapsulation;

public class Main {

  public static void main(String[] args) {

    // Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods.
    // This way, the fields can be made read-only (if you only use the get method), or write-only (if you only use the set method).
    // Encapsulation can be described as a protective barrier that keeps the data safe within the object.

    Car car = new Car("Toyota", "Camry", 2018);
    System.out.println("Make: " + car.getMake());
    System.out.println("Model: " + car.getModel());
    System.out.println("Year: " + car.getYear());
  }
  
}
