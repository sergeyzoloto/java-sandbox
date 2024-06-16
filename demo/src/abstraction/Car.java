package abstraction;

public class Car extends Vehicle{

  @Override
  void go() {
    System.out.println("Car is going");
  }

  @Override
  void stop() {
    System.out.println("Car is stopping");
  }
  
}
