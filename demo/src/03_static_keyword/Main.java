public class Main {
  
  public static void main(String[] args) {
    
    // static = modifier. A single copy of a variable/method is created and shared.
    // The class "owns" the static member 

    Friend friend1 = new Friend("John");
    Friend friend2 = new Friend("Jane");
    Friend friend3 = new Friend("Tom");

    // friend1.displayFriends();
    // Error: Cannot make a static reference to the non-static method displayFriends() from the type Friend
    
    Friend.displayFriends();
  }
}
