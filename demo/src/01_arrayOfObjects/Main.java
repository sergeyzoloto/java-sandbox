import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  private static final String APPLE = "Apple";
  private static final String BANANA = "Banana";
  private static final String CHERRY = "Cherry";

  public static void main(String[] args) {

    Food[] foods = new Food[3];
    foods[0] = new Food(APPLE);
    foods[1] = new Food(BANANA);
    foods[2] = new Food(CHERRY);

    for (int i = 0; i < foods.length; i++) {
      System.out.println(foods[i].name);
    }

    // Another way to create an array of objects
    Food food1 = new Food("Date");
    Food food2 = new Food("Eggplant");
    

    Food[] moreFoods = {
      new Food("Fig"),
      new Food("Grape"),
      food1,
      food2
    };

    for (int i = 0; i < moreFoods.length; i++) {
      System.out.println(moreFoods[i].name);
    }

    // `ArrayList`

    // `ArrayList` is a class in the `java.util` package
    // that provides a way to create a dynamic array of objects.
    // It is similar to an array, but it can grow and shrink in size.
    // You can add, remove, and access elements in an `ArrayList`.

    // To use an `ArrayList`, you need to import the `java.util.ArrayList` class.
    // You can create an `ArrayList` of objects by specifying the type of objects it will hold.
    // For example, to create an `ArrayList` of `Food` objects, you can write:
    // `ArrayList<Food> foods = new ArrayList<Food>();`

    // Here is an example of how to use an `ArrayList`:

    ArrayList<Food> foodsList = new ArrayList<>();

    foodsList.add(new Food(APPLE));
    foodsList.add(new Food(BANANA));
    foodsList.add(new Food(CHERRY));

    for (int i = 0; i < foodsList.size(); i++) {
      System.out.println(foodsList.get(i).name);
    }

    Food food3 = new Food("Date");
    Food food4 = new Food("Eggplant");

    foodsList.add(new Food("Fig"));
    foodsList.add(new Food("Grape"));
    foodsList.add(food3);
    foodsList.add(food4);

    System.out.println("\nThe size of the list is " + foodsList.size());
    for (int i = 0; i < foodsList.size(); i++) {
      System.out.println(foodsList.get(i).name);
    }

    // You can also use the enhanced `for` loop to iterate over the elements of an `ArrayList`:
    for (Food food : foodsList) {
      System.out.println(food.name);
    }

    // You can remove an element from an `ArrayList` by calling the `remove` method with the index of the element to remove:
    foodsList.remove(0);

    // You can remove an element from an `ArrayList` by calling the `remove` method with the object to remove:
    foodsList.remove(food3);

    // You can check if an `ArrayList` contains a specific element by calling the `contains` method:
    if (foodsList.contains(food4)) {
      System.out.println("\nThe list contains Eggplant");
    }

    // You can get the index of an element in an `ArrayList` by calling the `indexOf` method:
    int index = foodsList.indexOf(food4);
    System.out.println("\nEggplant is at index " + index);

    // You can convert an `ArrayList` to an array by calling the `toArray` method:
    Food[] emptyFoodsArray = foodsList.toArray(new Food[0]);
    // Show the length of the array
    System.out.println("\nThe length of the array is " + emptyFoodsArray.length);

    // You can convert an array to an `ArrayList` by calling the `asList` method of the `Arrays` class:
    Food[] foodsArray = { new Food(APPLE), new Food(BANANA), new Food(CHERRY) };
    ArrayList<Food> refrigerator = new ArrayList<>(Arrays.asList(foodsArray));
    // Show the size of the `ArrayList`
    System.out.println("\nThe size of the ArrayList is " + refrigerator.size());

    // You can sort an `ArrayList` by calling the `sort` method of the `Collections` class:
    Collections.sort(foodsList, (f1, f2) -> f1.name.compareTo(f2.name));
    System.out.println("\nSorted list:");
    for (Food food : foodsList) {
      System.out.println(food.name);
    }

    // You can clear all elements from an `ArrayList` by calling the `clear` method:
    foodsList.clear();
    // You can check if an `ArrayList` is empty by calling the `isEmpty` method:
    System.out.println("\nCheck if the list is empty:");
    if (foodsList.isEmpty()) {
      System.out.println("The list is empty");
    }


  }
  
}