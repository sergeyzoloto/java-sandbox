package abstraction;

public class Main {

  // Abstract classes = abstract methods cannot be instantiated (no body), but can be subclassed
  // Abstract methods = methods without implementation (no body)
  
  public static void main(String[] args) {
      
      // Vehicle vehicle = new Vehicle(); // cannot instantiate an abstract class
      
      Car car = new Car();
      
      car.go();
      car.stop();
  }
}
