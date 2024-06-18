package bounded_types;

public class MyGenericClass <T extends Number>{

  T x;

  MyGenericClass(T x) {
    this.x = x;
  }

  public T getValue() {
    return x;
  }
  
}
