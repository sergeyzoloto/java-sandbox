package classes;

public class Project {

  public static void main(String[] args) {
    Car myCar = new Car();
    System.out.printf("I have a %d %s %s that is %s and costs $%,.2f\n", 
      myCar.year, myCar.make, myCar.model, myCar.color, myCar.price);

    Human human = new Human("John", 30, 180.0);
    System.out.printf("My name is %s, I am %d years old, and I weigh %.1f pounds\n", 
      human.name, human.age, human.weight);
    
    Human human2 = new Human("Jane", 25, 120.0);
    System.out.printf("My name is %s, I am %d years old, and I weigh %.1f pounds\n", 
      human2.name, human2.age, human2.weight);
    
    human.eat();
    human.sleep();
    human.work();

    human2.eat();
    human2.eat();
    human2.eat();

    // toString() is a method that all objects inherit from the Object class
    // that returns a string representation of the object

    // Print car object
    System.out.println(myCar);
    System.out.println(myCar.toString());

  }

  
}