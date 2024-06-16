# Java cheat sheet

## How Java is different from JavaScript?

Java is a **statically typed language**. Meaning declaring variables in Java is much more strict than in JavaScript. You have to explicitly declare what type of variable you are creating in Java.

In order to do anything in Java, you must use **utilize classes**. Classes are reusable blocks of code that produce objects for real world examples such as a user signing up on your website. The fact that Java is so structured can greatly help find and identify bugs.

Java applications and programs are run in a **JVM (Java Virtual Machine)**, which is known as a Java Virtual machine. This lends to the fact that Java is **platform independent** and it's so flexible.

## How Java works

Java development starts with writing **source code** in `.java` files, which is then compiled by a **compiler** into **byte code**, a platform-independent representation stored in `.class` files. This byte code is executed by the **Java Virtual Machine (JVM)**, which interprets it into **object code** (machine code) that the computer's processor can execute. This process, from source code to machine execution, underpins Java's platform independence, allowing Java applications to run on any device with a JVM installed, embodying its write-once-run-anywhere capability.

## JDK

The **JDK (Java Development Kit)**, **JRE (Java Runtime Environment)**, and **JVM (Java Virtual Machine)** are three core components of the Java programming language

- **JDK (Java Development Kit)**: The JDK is a software development environment used for developing Java applications and applets. It includes the JRE, an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc) and other tools needed in Java development. Essentially, the JDK is everything you need to write, compile, and debug Java applications.

- **JRE (Java Runtime Environment)**: The JRE is a part of the Java Development Kit which provides the libraries, the Java Virtual Machine (JVM), and other components to run applications and applets written in Java. The JRE does not contain tools and utilities such as compilers or debuggers for developing applets and applications. JRE is what you need to run Java applications on your computer.

- **JVM (Java Virtual Machine)**: The JVM is an engine that provides a runtime environment to drive the Java Code or applications. It converts Java bytecode into machine language. JVM is a part of both JDK and JRE because it is the base for running Java applications. The JVM is what makes Java platform independent, allowing Java applications to run on any device that has a JVM installed.

## Variables

In Java, variables are categorized based on the data they store and their scope. The main types of variables are:

- **Primitive Variables**: These store primitive data types such as `int`, `float`, `double`, `boolean`, `char`, etc. They hold the actual values.

- **Reference Variables**: These store references (or addresses) to objects in memory. They point to objects created from classes, arrays, or interfaces. They are unlimited (user defined), could hold more than one value, take more memory and actually slowly than primitive variables.

- **Instance Variables (Non-static Fields)**: Declared without the `static` keyword, these variables are unique to each instance of a class. They represent the state of an object.

- **Class Variables (Static Fields)**: Declared with the `static` keyword, these variables are shared among all instances of a class. They represent the state of the class.

### Primitive variables

In Java, primitive types are the most basic data types. They are not objects and hold their values directly in memory. The main primitive types in Java are:

- **byte**: This is an 8-bit signed integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).

- **short**: A 16-bit signed integer, with a minimum value of -32,768 and a maximum value of 32,767.

- **int**: A 32-bit signed integer, with a minimum value of -2^31 and a maximum value of 2^31-1.

- **long**: A 64-bit signed integer, with a minimum value of -2^63 and a maximum value of 2^63-1.

- **float**: A single-precision 32-bit IEEE 754 floating point. It's used to save memory in large arrays of floating point numbers.

- **double**: A double-precision 64-bit IEEE 754 floating point. It's generally used for decimal values, such as currency.

- **boolean**: It has only two possible values: `true` and `false`. It's used for simple flags that track true/false conditions.

- **char**: A single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

### long and float primitive variables assignment

When declaring `long` and `float` variables in Java, there are syntax peculiarities to be aware of:

- **long**: To explicitly declare a variable of type `long`, you append an `L` or `l` to the end of the value. However, using `L` is preferred because `l` can be easily confused with the digit `1`. For example, `long myLong = 123456789L;`.

- **float**: For `float` variables, you must append an `F` or `f` to the end of the value to indicate that the number is a `float` and not a `double` (as `double` is the default type for floating-point numbers in Java). For example, `float myFloat = 12.34F;`.

### Declaration, assignment, initialization

- **Declaration**: `int myNumber;`.

- **Assignment**. After a variable is declared, it can be assigned a value: `myNumber = 5;`.

- **Initialization**. Combines declaration and assignment into a single step: `int myNumber = 5;`.

## Expressions, operands, operators

In Java, expressions are constructs that evaluate to a single value. Expressions are made up of operands and operators:

- **Operands** are the data or variables on which operations are performed.
- **Operators** are symbols that perform operations on operands. Java supports various types of operators, including
  arithmetic (`+`, `-`, `*`, `/`, `%`),
  relational (`<`, `>`, `<=`, `>=`, `==`, `!=`),
  logical (`&&`, `||`, `!`),
  assignment (`=`, `+=`, `-=`, `*=`, `/=`, `%=`), and more.

An expression combines operands and operators according to the syntax of Java to produce another value. For example, in the expression `int result = 10 + 5;`, `10` and `5` are operands, `+` is the operator, and `result` is assigned the value of the expression, which is `15`.

In addition to the operators mentioned, Java also supports the **increment** (`++`) and **decrement** (`--`) operators, which are used to increase or decrease a variable's value by one, respectively. These operators can be used in two forms:

- **Prefix**: When used before the variable (e.g., `++myNumber` or `--myNumber`), the operation is performed, and the value of the expression is the new value of the variable.

- **Postfix**: When used after the variable (e.g., `myNumber++` or `myNumber--`), the original value of the variable is the value of the expression, and then the operation is performed.

## Wrapper Classes

In Java, wrapper classes provide a way to use primitive data types (`int`, `char`, `double`, etc.) as objects. Each primitive data type has a corresponding wrapper class:

- `int` -> `Integer`
- `char` -> `Character`
- `double` -> `Double`
- `boolean` -> `Boolean`
- and so on for `byte`, `short`, `long`, `float`

Wrapper classes are useful for working with collections, such as `ArrayList`, which can only store objects. They also offer utility methods for converting between types, parsing strings, and more. Autoboxing and unboxing automatically convert between primitive types and their corresponding wrapper classes, simplifying their use in Java code.## Wrapper Classes

## ArrayList

The `ArrayList` class in Java is a resizable array implementation of the `List` interface. It provides dynamic arrays that can grow as needed, offering flexibility not available with standard arrays. `ArrayList` supports operations such as adding, removing, and searching for elements. It stores its elements as `Object` instances, allowing it to hold any type of objects, including instances of wrapper classes for primitive types. This makes `ArrayList` a versatile choice for storing collections of data where the size may vary dynamically during runtime.

### 2D ArrayList

searching for elements. It allows for the storage of elements of any type, including objects and instances of wrapper classes, making it highly versatile for various programming needs. Additionally, `ArrayList` offers methods to access and modify elements at specific indexes, check the size of the collection, and clear the collection, among others. Its ability to dynamically adjust its size makes it a popular choice for managing collections of data where the number of elements is not known in advance or may change over time.

## Methods

In the context of programming, particularly in object-oriented languages like Java, methods are blocks of code designed to perform a specific task. A method is associated with an object or a class and can manipulate the **state** (data) of that object or class. Methods are defined within a class and are used to express the **behaviors** of objects. They can take parameters, perform operations or calculations, and return a value.

## final Keyword for creating immutable variables

When applied to a variable, it must be initialized at the time of declaration or inside the constructor if it's an instance variable. For methods, marking them as `final` prevents them from being overridden in subclasses, ensuring consistent behavior across different implementations. Similarly, when a class is declared as `final`, it cannot be subclassed, making it a reliable choice for creating immutable and secure classes that maintain their integrity throughout the application lifecycle.

## Objects, classes, instances

In Java, the concepts of objects, classes, and instances are foundational to its object-oriented programming model. A **class** is a blueprint from which individual **objects** (instances) are created. The class defines the properties (attributes/fields) and behaviors (methods/functions) that its objects will have. An **instance** refers to a single realization of a class. When a new instance of a class is created, it is said that an object has been instantiated. This process involves allocating memory for the new object and initializing its state through constructors. Understanding these concepts is crucial for designing and implementing software in Java, as they enable the encapsulation of data and behavior, inheritance, and polymorphism, which are key principles of object-oriented programming.

### Constructors

In Java, constructors are special methods used to initialize new objects. They have the same name as the class and do not return a value, not even `void`. Constructors are called when an instance of a class is created, and they can take parameters to set initial values for the object's attributes. Java allows for the definition of multiple constructors in a class, each with different parameters, known as constructor overloading. This feature enables objects to be initialized in different ways, providing flexibility in how objects are created and set up.

### Local and global variables

In Java, variables are categorized based on their scope as either local or global (more commonly referred to as instance variables or class variables). **Local variables** are defined within a method and can only be accessed within that method. They are created when the method is called and destroyed when the method exits. **Global variables**, on the other hand, are divided into **instance variables** and **class variables**. **Instance variables** are associated with an instance of a class; each object has its own copy of the instance variable. **Class variables** are marked with the `static` keyword and are shared among all instances of the class. Understanding the scope and lifetime of these variables is essential for managing data within your Java applications effectively.

### Overloaded constructors

In Java, overloaded constructors are multiple constructors within the same class, each having a different parameter list. This allows for creating objects in various states, depending on the information available at the time of instantiation. Overloading constructors enhance a class's flexibility and readability by providing multiple ways to initialize an object's state. It's a key aspect of Java's object-oriented capabilities, enabling developers to write more maintainable and scalable code by offering various initialization paths that suit different use cases.

### toString methods overriding

In Java, the `toString` method is a public method inherited from the `Object` class. It is intended to return a string representation of the object. Overriding this method in your class allows you to provide a more informative and readable string representation that is specific to the objects of your class. This is particularly useful for debugging purposes, as it enables you to quickly see the values of an object's fields without needing to write additional code to print each one. By customizing the `toString` method, developers can improve the usability and clarity of their classes when objects are printed or logged.

## Array of Objects, collections

In Java, an array of objects is a data structure that allows you to store multiple objects of the same type together. This can be particularly useful when you want to group related objects for easy access and manipulation. However, arrays have a fixed size once initialized, which limits their flexibility. To overcome this limitation, Java provides collections such as `ArrayList`, `HashSet`, and `HashMap`, among others. Collections are dynamic, meaning they can grow or shrink in size as needed, providing a more flexible way to handle groups of objects. They also offer a rich set of methods for performing operations like adding, removing, and searching elements, making them an essential tool for Java developers.

### Object passing

In Java, when objects are passed to methods, what is actually passed is a reference to the object, not the object itself. This means that if you modify the object inside the method, the changes will be reflected in the original object outside the method. This behavior facilitates the manipulation of objects across different parts of a program without the need to copy or recreate objects.

## static keyword

The `static` keyword in Java is used to indicate that a particular field, method, or block belongs not to any instance of a class, but to the class itself. Static members are shared among all instances of a class, making them ideal for defining constants or utility functions that are common to all objects of that class. Additionally, static blocks can be used for static initialization of a class. This keyword plays a crucial role in memory management by reducing the amount of memory required for common data and methods shared by objects.

## Inheritance

This concept allows a class to inherit properties and methods from another class. The class that inherits is called the `subclass` or `child class`, while the class from which properties are inherited is known as the `superclass` or `parent class`. Inheritance promotes code reuse and establishes a hierarchical classification of classes, which is crucial for organizing complex software systems.

### Method overriding

Method overriding occurs in Java when a subclass provides a specific implementation for a method that is already defined in its superclass. This mechanism allows a subclass to modify the behavior of the superclass method according to its needs. Overriding ensures that the subclass can offer a more specific behavior for the inherited methods, enhancing the `polymorphism` feature of Java.

### super keyword

The `super` keyword in Java is used within a subclass to refer to its parent class. It can be used to call methods and constructors of the parent class that may be overridden or hidden in the subclass. The `super` keyword is instrumental in accessing and invoking the parent class's behaviors, ensuring that the subclass can leverage and extend the functionalities of its superclass.

## Abstraction

Abstraction in Java is a process of hiding the implementation details and showing only the functionality to the users. It can be achieved with abstract classes and interfaces. Abstract classes cannot be instantiated, but they can have abstract methods, which are methods without bodies. These methods must be implemented by subclasses. Abstraction helps in reducing complexity and allows the programmer to focus on interactions at a higher level.

## Access modifiers

Access modifiers in Java determine the accessibility or scope of a field, method, constructor, or class. There are four types of access modifiers: `private`, `protected`, `public`, and default (no modifier).
`Private` members are accessible only within the same class,
`protected` members within the same package or subclasses,
and `public` members from any class.
The default modifier means the member is accessible only within its own package. Access modifiers are fundamental for encapsulation in Java.

## Encapsulation, getters and setters

Encapsulation is one of the four fundamental OOP concepts. It is the technique of making the fields in a class private and providing access to the fields via public methods. It's a way to protect the data from unauthorized access and modification. Encapsulation in Java is achieved using access modifiers, ensuring that sensitive data is hidden from users and can be accessed only through designated methods.

## Copy objects

Copying objects in Java can be achieved through several methods, including cloning (using the `clone()` method), copy constructors, and copying through serialization. Each method has its own use cases and considerations regarding deep and shallow copying.

## Interface

An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructor methods. They are used to specify a set of methods that a class must implement, providing a way to achieve abstraction and multiple inheritance in Java.

## Polymorphism

Polymorphism is the ability of an object to take on many forms. In Java, this means that a single interface can be used to represent different underlying forms of an object. This is one of the core concepts of OOP and allows for actions to be performed in different ways, based on the actual object that the action is being performed on. Polymorphism in Java is mainly divided into two types: compile-time (static) and runtime (dynamic) polymorphism.

## Dynamic polymorphism

Dynamic polymorphism, also known as runtime polymorphism, is achieved in Java through method overriding. This occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass. At runtime, the Java Virtual Machine (JVM) determines which method to execute based on the object's runtime type, allowing for dynamic method dispatch.
