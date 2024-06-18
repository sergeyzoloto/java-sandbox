package serialization;

import java.io.*;

public class Main {

  // serialization = the process of converting an object into a stream of bytes
  // to store the object or transmit it to memory, a database, or a file
  // its main purpose is to save the state of an object in order to be able to
  // recreate it when needed

  // Steps to serialize an object:
  // 1. Make sure the class implements the java.io.Serializable interface
  // 2. Create a FileOutputStream object
  // 3. Create an ObjectOutputStream object
  // 4. Call the writeObject() method on the ObjectOutputStream object
  // 5. Close the ObjectOutputStream object
  // 6. Close the FileOutputStream object

  // deserialization = the process of converting a stream of bytes back into an
  // object

  // Steps to deserialize an object:
  // 1. Create a FileInputStream object
  // 2. Create an ObjectInputStream object
  // 3. Call the readObject() method on the ObjectInputStream object
  // 4. Close the ObjectInputStream object
  // 5. Close the FileInputStream object

  // Important points:
  // 1. children classes of a serializable class are themselves serializable
  // 2. static fields are not serialized because they are not part of the state
  // 3. fields declared as transient are not serialized
  // 4. the class's definition must be available to the JVM that is deserializing
  // 5. the serialVersionUID is used a unique identifier for the class

  public static void main(String[] args) {

    // serialization
    
    // Create a User object
    User user = new User("John", 30, "email@email.com");

    // Create a file
    File file = new File("demo/src/serialization/user.txt");

    try {
      // Create a FileOutputStream object
      FileOutputStream fos = new FileOutputStream(file);

      // Create an ObjectOutputStream object
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // Call the writeObject() method on the ObjectOutputStream object
      oos.writeObject(user);

      // Close the ObjectOutputStream object
      oos.close();

      // Close the FileOutputStream object
      fos.close();

      // Print a message
      System.out.println("\nUser object has been serialized and saved in user.txt file.");

    } catch (IOException e) {
      e.printStackTrace();
    }
    // deserialization

    // Create a User object
    User userDeserialized = null;

    try {
      // Create a FileInputStream object
      FileInputStream fis = new FileInputStream(file);

      // Create an ObjectInputStream object
      ObjectInputStream ois = new ObjectInputStream(fis);

      // Call the readObject() method on the ObjectInputStream object
      // and cast the returned object to a User object
      userDeserialized = (User) ois.readObject();

      // Close the ObjectInputStream object
      ois.close();

      // Close the FileInputStream object
      fis.close();

      // Print a message
      System.out.println("\nUser object has been deserialized.");
      System.out.println("User Deserialized: " + userDeserialized.toString());

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}