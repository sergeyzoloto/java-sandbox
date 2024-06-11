package classes;

class Human {

  String name;
  int age;
  double weight;

  // Constructor
  Human(String name, int age, double weight) {
    // Assign the values of the parameters to the fields
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void eat() {
    System.out.println("You eat");
  }

  void sleep() {
    System.out.println("You sleep");
  }

  void work() {
    System.out.println("You work");
  }
}