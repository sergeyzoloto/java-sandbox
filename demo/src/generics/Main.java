package generics;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
   
    // Generics = classes, interfaces, methods 
    //            a benefit is to eliminate the need to create multiple versions
    //            of the type for different data types
    //            Use one version that can handle multiple data types
    //            a type parameter is a placeholder for a type (e.g., T)same class, interface, or method

    Integer intArray[] = {1, 2, 3, 4, 5};
    Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
    Character charArray[] = {'H', 'E', 'L', 'L', 'O'};
    String stringArray[] = {"one", "two", "three", "four", "five"};

    System.out.println("Array integerArray contains:");
    displayArray(intArray);

    System.out.println("\nArray doubleArray contains:");
    displayArray(doubleArray);

    System.out.println("\nArray characterArray contains:");
    displayArray(charArray);

    System.out.println("\nArray stringArray contains:");
    displayArray(stringArray);

    System.out.println("\nFirst element of integerArray: " + getFirstElement(intArray));
    System.out.println("First element of doubleArray: " + getFirstElement(doubleArray));
    System.out.println("First element of characterArray: " + getFirstElement(charArray));
    System.out.println("First element of stringArray: " + getFirstElement(stringArray));

    // Not generic classes
    MyIntegerClass myInt = new MyIntegerClass(10);
    MyDoubleClass myDouble = new MyDoubleClass(10.0);
    MyCharacterClass myChar = new MyCharacterClass('A');
    MyStringClass myString = new MyStringClass("Hello");

    System.out.println("\nMyIntegerClass: " + myInt.getValue());
    System.out.println("MyDoubleClass: " + myDouble.getValue());
    System.out.println("MyCharacterClass: " + myChar.getValue());
    System.out.println("MyStringClass: " + myString.getValue());

    // Generics classes
    MyGenericClass<Integer> myIntGen = new MyGenericClass<Integer>(10);
    MyGenericClass<Double> myDoubleGen = new MyGenericClass<Double>(10.0);
    MyGenericClass<Character> myCharGen = new MyGenericClass<Character>('A');
    MyGenericClass<String> myStringGen = new MyGenericClass<String>("Hello");

    System.out.println("\nMyGenericClass: " + myIntGen.getValue());
    System.out.println("MyGenericClass: " + myDoubleGen.getValue());
    System.out.println("MyGenericClass: " + myCharGen.getValue());
    System.out.println("MyGenericClass: " + myStringGen.getValue());

    // Generic types in arrayL
    ArrayList<String> myFriends = new ArrayList<>();
    
  }

  public static <Thing> void displayArray(Thing[] inputArray) {
    for (Thing element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  public static <Thing> Thing getFirstElement(Thing[] inputArray) {
    return inputArray[0];
  }

  
}
