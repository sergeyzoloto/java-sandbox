public class Strings {
  
  public static void main(String[] args) {
    
    // Strings = a reference data type that can store one or more characters
    // reference data types have access to useful methods

    String name = "Alice";
    String name2 = new String("Alice");
    System.out.println(name);
    System.out.println(name2);

    // Strings are immutable
    // name[0] = "B"; // error

    // Concatenation
    String firstName = "Alice";
    String lastName = "Smith";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    // Methods
    System.out.println(fullName.length()); // 11

    System.out.println(fullName.isEmpty()); // false

    System.out.println(fullName.toUpperCase()); // ALICE SMITH
    System.out.println(fullName.toLowerCase()); // alice smith

    System.out.println(fullName.indexOf("Smith")); // 6
    System.out.println(fullName.indexOf("Alice"));  // 0

    System.out.println(fullName.charAt(0)); // A
    System.out.println(fullName.charAt(6)); // S

    System.out.println(fullName.substring(0, 5)); // Alice
    System.out.println(fullName.substring(6)); // Smith
    System.out.println(fullName.substring(6, 11)); // Smith

    System.out.println(fullName.contains("Smith")); // true
    System.out.println(fullName.contains("Jones")); // false

    System.out.println(fullName.equals("Alice Smith")); // true
    System.out.println(fullName.equals("Alice Smith ")); // false

    System.out.println(fullName.equalsIgnoreCase("alice smith")); // true
    System.out.println(fullName.equalsIgnoreCase("alice smith ")); // false

    System.out.println(fullName.startsWith("Alice")); // true
    System.out.println(fullName.startsWith("Smith")); // false

    System.out.println(fullName.endsWith("Smith")); // true
    System.out.println(fullName.endsWith("Alice")); // false
    
    System.out.println(fullName.replace("Alice", "Bob")); // Bob Smith
    System.out.println(fullName.replace("Smith", "Jones")); // Alice Jones
    System.out.println(fullName.replace(" ", "_")); // Alice_Smith

    System.out.println(fullName.substring(0, 6).length()); // 6
    System.out.println(fullName.substring(0, 6).trim()); // Alice
    System.out.println(fullName.substring(0, 6).trim().length()); // 5

  }
}
