package read_file;

import java.io.FileReader;

public class Main {

  public static void main(String[] args) {
    
    // FileReader is used to read the contents of a file as a stream of characters. One by one
    // read() method returns an int value which contains the byte value of the character read.
    // If the end of the file is reached, -1 is returned.
    
    // The FileReader class is passed to the try-with-resources statement.
    // The fileReader will be automatically closed after the try block.
    try (FileReader fileReader = new FileReader("demo/src/read_file/input.txt")) {
      int data;
      while ((data = fileReader.read()) != -1) {
        System.out.print((char) data);
      }
      // The fileReader will be automatically closed here, even if read() throws an exception
      System.out.println("\nFile read successfully");
    } catch (java.io.FileNotFoundException e) {
      e.printStackTrace();
    } catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
}
