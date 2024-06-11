import java.util.ArrayList;

public class ResizableArrays {

  public static void main(String[] args) {
    // ArrayLists = a resizable array
    // Elements can be added and removed after compilation
    // Store reference data types
    // ArrayLists can't store primitive data types (ex. int, char)
    // ArrayLists have access to useful methods

    ArrayList<String> food = new ArrayList<String>();

    food.add("Pizza");
    food.add("Burger");
    food.add("Salad");

    for(int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }

    // Modify element
    System.out.println("\n" + "Index 0 is modified");
    food.set(0, "Sushi");

    for(int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }

    // Remove element

    System.out.println("\n" + food.get(2) + " is removed");
    food.remove(2);

    for(int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }

    // Clear the ArrayList
    food.clear();
    System.out.println("\n" + "ArrayList is cleared");

    for(int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }
  }
}