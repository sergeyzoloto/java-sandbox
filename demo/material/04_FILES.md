# Working with files in Java

## File class

The File class in Java is part of the `java.io` package and represents a file or directory path in the system. It provides various methods to create, delete, inspect, and modify files and directories. For example, you can check if a file exists, read its permissions, or list the files in a directory. However, it does not allow for reading or writing the content of files; for that, other classes like FileReader or FileWriter are used.

[Code](../src/file_class/)

## Write to file

Writing to a file in Java typically involves using classes such as `FileWriter`, BufferedWriter, or PrintWriter. These classes provide methods to write text to a file in an efficient and convenient way. For example, FileWriter is used to write character-oriented data to a file, while BufferedWriter provides buffering to ensure efficient writing. PrintWriter offers methods to print formatted representations of objects to a text-output stream, making it useful for writing text files.

[Code](../src/write_to_file/)

## File reader

The `FileReader` class in Java is used to read data from files as streams of characters. It extends the InputStreamReader class and is designed for reading streams of characters from files. This class is often used in conjunction with BufferedReader to improve efficiency and performance by buffering the input. BufferedReader also provides a convenient method to read a line of text at a time, simplifying the process of reading text files line by line.

[Code](../src/read_file/)
