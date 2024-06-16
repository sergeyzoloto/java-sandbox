package access_modifiers.package2;
import access_modifiers.package1.*;

public class Asub extends A {

  public static void main(String[] args) {
    
    C c = new C();
    System.out.println(c.publicMessage); 
    System.out.println(c.protectedMessage);
    System.out.println(c.defaultMessage);
    // System.out.println(c.privateMessage); // Compilation error
  
  }
}
