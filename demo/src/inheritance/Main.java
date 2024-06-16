package inheritance;

public class Main {
  
  // inheritance = the process where one class acquires the attributes and methods of another
  // the attributes and methods of the parent class are inherited by the child class

  public static void main(String[] args) {

    Car car = new Car();
    car.go();

    Bicycle bicycle = new Bicycle();
    bicycle.stop();

    // Car and Bicycle are subclasses of Vehicle

    // Car and Bicycle inherit the attributes and methods from Vehicle
    System.out.println(car.speed);
    System.out.println(bicycle.speed);
  }
}
