package polymorphism;

public class Main {
  
  public static void main(String[] args) {
    
    // polymorphism = many shapes/forms
    // polymorphism in Java is achieved by method overloading and method overriding
  
    // method overloading = methods have the same name but different parameters
    // method overriding = a method in a child class has the same name and parameters as in its parent class

    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    Vehicle[] racers = {car, bicycle, boat};

    for(Vehicle x: racers) {
      x.go();
    }
  }
}
