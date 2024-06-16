package copy_objects;

public class Car {
  
  // Variables are private so they cannot be accessed directly
  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    this.setMake(make);
    this.setModel(model);
    this.setYear(year);
  }

  public Car(Car car) {
    this.copy(car);
  }

  // Getters and setters

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // Copy constructor
  public void copy(Car car) {
    this.setMake(car.getMake());
    this.setModel(car.getModel());
    this.setYear(car.getYear());
  }
}
