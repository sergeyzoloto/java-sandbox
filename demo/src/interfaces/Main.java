package interfaces;

public class Main {

  public static void main(String[] args) {
    
    // interface = a template that can be applied to a class
    // similar to inheritance, but specifies what a class has/must do
    // classes can apply more than one interface, inheritance is limited to one superclass

    
    Fish fish = new Fish();
    fish.flee();
    fish.hunt();
    
    Rabbit rabbit = new Rabbit();
    rabbit.flee();
    
    Hawk hawk = new Hawk();
    hawk.hunt();


  }
  
}
