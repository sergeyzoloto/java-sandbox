package file_class;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.NoSuchFileException;
import java.io.IOException;

public class Main {
  
  public static void main(String[] args) {
    
    // file = An abstract representation of file and directory path names

    try {
      
      File myFile = new File("demo/src/read_file/demo.txt");
    
      if (myFile.exists()) {
        System.out.println("Is file: " + myFile.isFile());
        System.out.println("File name: " + myFile.getName());
        System.out.println("Path: " + myFile.getPath());
        System.out.println("Absolute path: " + myFile.getAbsolutePath());
        System.out.println("Writeable: " + myFile.canWrite());
        System.out.println("Readable: " + myFile.canRead());
        System.out.println("File size in bytes: " + myFile.length());
      } else {
        System.out.println("The file does not exist.");
      }
      
    } catch (Exception e) {
      
      System.out.println("Error occurred while opening the file.");
      
    }

    // Deleting a file

    try {
        // Assuming myFile is of type java.io.File, convert it to java.nio.file.Path
        File myFile = new File("demo/src/read_file/demo.txt");
        Path path = myFile.toPath();
        Files.delete(path);
        System.out.println("File deleted successfully.");
    } catch (NoSuchFileException e) {
        System.out.println("The file does not exist.");
    } catch (IOException e) {
        System.out.println("An I/O error occurred: " + e.getMessage());
    }
  }
}
