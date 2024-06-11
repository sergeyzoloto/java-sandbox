public class Wrapper {

  public static void main(String[] args) {
    
    // Wrapper classes = provide a way to use primitive data types as objects
    // Wrapper class objects contain fields, constructors, and methods
    // for the primitive data types
    // Useful for collections (ex. ArrayList where primitive data types are not allowed)

    // Autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
    // Unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

    // Primitive data types // Wrapper classes
    // boolean // Boolean
    // char // Character
    // int // Integer
    // double // Double

    // Autoboxing

    Boolean a = true;
    Character b = '@';
    Integer c = 123;
    Double d = 3.14;
    String e = "Bro";
    
    // Unboxing

    if (a == true) {
      System.out.println("This is true");
    }
    
  }
}