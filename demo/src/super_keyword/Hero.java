package super_keyword;

public class Hero extends Person{

  String power;

  public Hero(String name, int age, String power) {
    super(name, age);
    this.power = power;
  }

  public String toString() {
    return super.toString() + "\nPower: " + power;
  }
}
