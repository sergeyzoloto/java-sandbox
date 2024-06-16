package dynamic_polymorphism;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.speak();
    
    animal = new Dog();
    animal.speak();
    
    animal = new Cat();
    animal.speak();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the animal type (dog or cat): ");
    String animalType = scanner.next();
    
    if (animalType.equals("dog")) {
      animal = new Dog();
    } else if (animalType.equals("cat")) {
      animal = new Cat();
    } else {
      System.out.println("Invalid animal type");
    }

    animal.speak();

    scanner.close();
  }
  
}
