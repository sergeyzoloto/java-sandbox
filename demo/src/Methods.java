public class Methods {

  public static void main(String[] args) {
    
    // method = a block of code that is executed whenever it is called upon

    int x = 3;
    int y = 4;

    // method call
    // with creating local variable z
    int z = add(x, y);

    System.out.println(z);
  }

  static int add(int a, int b) {

    // local variable z in another method
    // (scope of z is only in this method)
    int z = a + b;
    System.out.println(z);

    return z;
  }
}