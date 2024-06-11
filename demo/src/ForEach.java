import java.util.ArrayList;

public class ForEach {

  public static void main(String[] args) {
    
    // for each = traverse through the elements of an array or collection
    //            and perform some operation on each element
    //            less steps, more readable, less flexible

    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Lion");
    animals.add("Tiger");

    for (String animal : animals) {
      System.out.println(animal);
    }
  }
  
}