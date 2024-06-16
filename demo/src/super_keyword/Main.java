package super_keyword;

public class Main {
  
  // super keyword = refers to the superclass (parent) of an object
  //                 very similar to the "this" keyword

  public static void main(String[] args) {

    Hero hero = new Hero("Batman", 42, "Money");
    Hero hero2 = new Hero("Superman", 35, "Everything");

    System.out.println("\nHero's name: " + hero.name);
    System.out.println("Hero's age: " + hero.age);
    System.out.println("Hero's power: " + hero.power);

    System.out.println();
    System.out.println(hero + "\n"); // calls toString() method
    System.out.println(hero2.toString());
  }
}
