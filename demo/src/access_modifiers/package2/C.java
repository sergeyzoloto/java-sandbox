package access_modifiers.package2;

public class C {
  
  // public keyword allows access from any class
  public static final String publicMessage = "This is a public message";

  // protected keyword allows access from the same package and subclasses
  protected String protectedMessage = "This is a protected message";

  // default keyword allows access from the same package
  String defaultMessage = "This is a default message";

  // private keyword allows access from the same class
  private String privateMessage = "This is a private message";

  public static void main(String[] args) {
    
    System.out.println(new C().privateMessage);

  }
}
