package object_passing;

public class Main {
  
  // How to pass an object to a method

  public static void main(String[] args) {
    Garage garage = new Garage();
    Car car = new Car("Toyota");
    Car car2 = new Car("Honda");
    garage.park(car);
    garage.park(car2);

  }
}
