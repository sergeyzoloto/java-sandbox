package copy_objects;

public class Main {

  public static void main(String[] args) {

    // Copying objects in Java can be done using the clone() method or by copying the fields of the object to another object.
    // The clone() method is used to create a copy of an object, but it is a shallow copy, meaning that the fields of the object are copied to the new object, but the references to the objects are not copied.
    // To create a deep copy of an object, you need to copy the fields of the object to a new object, and then create new objects for the fields that are references to other objects.
    // In the example below, we create a deep copy of a Car object by copying the fields of the Car object to a new Car object, and then creating new objects for the fields that are references to other objects.

    final String MAKE = "\nMake: ";
    final String MODEL = "Model: ";
    final String YEAR = "Year: ";

    Car car = new Car("Toyota", "Camry", 2018);
    
    // Create a deep copy of the Car object
    Car carCopy = new Car(car.getMake(), car.getModel(), car.getYear());
    System.out.println(MAKE + carCopy.getMake());
    System.out.println(MODEL + carCopy.getModel());
    System.out.println(YEAR + carCopy.getYear());

    // Copy the Car object using the copy() method
    Car carCopy2 = new Car("Toyota", "Corolla", 2019);
    carCopy2.copy(car);
    System.out.println(MAKE + carCopy2.getMake());
    System.out.println(MODEL + carCopy2.getModel());
    System.out.println(YEAR + carCopy2.getYear());

    // Copy the Car object using the constructor
    Car carCopy3 = new Car(car);
    System.out.println(MAKE + carCopy3.getMake());
    System.out.println(MODEL + carCopy3.getModel());
    System.out.println(YEAR + carCopy3.getYear());

  }
  
}
