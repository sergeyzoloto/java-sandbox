package encapsulation;

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
}
