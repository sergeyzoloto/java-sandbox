# Java execution

## Packages

Packages in Java are used to group related classes and interfaces, providing a namespace and access protection. They help to organize the code, prevent naming conflicts, and control access to the classes, making large software projects easier to manage and modularize.

## run command prompt

Running the command prompt in Java can be achieved using the `Runtime.getRuntime().exec(String command)` method, which allows the execution of system commands. This feature is useful for interacting with the operating system directly from Java applications, such as opening documents, running shell commands, or executing other programs.

### javac for compiling

`javac` is the primary Java compiler included in the Java Development Kit (JDK). It converts Java source code into bytecode, which can be executed by the Java Virtual Machine (JVM). To compile a Java program, you would typically use the `javac` command followed by the filename of the source code. For example, to compile a file named `Main.java`, you would use the command `javac Main.java` in your terminal.

## Executable (.jar)

Executable JAR files are Java archives that contain an application and its dependencies, along with an entry point specified in the manifest file, making it runnable as a standalone program. JAR files are platform-independent, allowing Java applications to be easily distributed and executed on any system with a Java Runtime Environment (JRE).

`javac \*.java`

This compiles all Java files in the directory, ensuring there are no compilation errors before packaging.
