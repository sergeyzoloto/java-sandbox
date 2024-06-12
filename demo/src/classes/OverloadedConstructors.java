package classes;

public class OverloadedConstructors {
  public static void main(String[] args) {
    Pizza pizza1 = new Pizza("wheat");
    System.out.printf("Pizza 1: %s\n", pizza1.bread);

    Pizza pizza2 = new Pizza("wheat", "garlic sauce");
    System.out.printf("Pizza 2: %s, %s\n", pizza2.bread, pizza2.sauce);

    Pizza pizza3 = new Pizza("wheat", "garlic sauce", "blue cheese");
    System.out.printf("Pizza 3: %s, %s, %s\n", pizza3.bread, pizza3.sauce, pizza3.cheese);

    Pizza pizza4 = new Pizza("wheat", "garlic sauce", "blue", "ham");
    System.out.printf("Pizza 4: %s, %s, %s, %s\n", pizza4.bread, pizza4.sauce, pizza4.cheese, pizza4.topping);

    Pizza pizza5 = new Pizza();
    System.out.printf("Pizza 5: %s, %s, %s, %s\n", pizza5.bread, pizza5.sauce, pizza5.cheese, pizza5.topping);
  }
}