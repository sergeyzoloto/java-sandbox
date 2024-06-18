package bounded_types;

public class Main {

  public static void main(String[] args) {

    // bounded types = restrict the types that can be used as type arguments
    // in a parameterized type

    // bounded types are used to ensure that a type argument is an instance of a
    // particular class or implements a particular interface

    MyGenericClass<Integer> myInt = new MyGenericClass<Integer>(10);
    MyGenericClass<Double> myDouble = new MyGenericClass<Double>(10.0);
    // Won't compile
    // MyGenericClass<Character> myChar = new MyGenericClass<Character>('A');
   
    
  }

  
}
