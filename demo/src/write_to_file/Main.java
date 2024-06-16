package write_to_file;

import java.io.FileWriter;

public class Main {

  public static void main(String[] args) {
    // Write to file
    
    // The FileWriter class is passed to the try-with-resources statement.
    // The fileWriter will be automatically closed after the try block.
    try (FileWriter fileWriter = new FileWriter("demo/src/write_to_file/output.txt")) {
      fileWriter.write("Hello, World!");
      // The fileWriter will be automatically closed here, even if write() throws an exception
    } catch (java.io.IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println("File written successfully.");
    }
  }

}
