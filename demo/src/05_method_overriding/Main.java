public class Main {

  public static void main(String[] args) {

    // method overriding = Declaring a method in sub class which is already present in parent class.
    //                   The method in sub class should have same name, same parameters or signature and same return type as in parent class.
    //                   When you override a method, the overridden method must have the same access level or a less restrictive access level.

    Animal animal = new Animal();
    Dog dog = new Dog();

    animal.speak();
    dog.speak();


  }
  
}
