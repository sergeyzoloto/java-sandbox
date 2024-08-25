# Object Oriented Programming in Java

## Objects, classes, instances

[Code](../src/classes/)

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

[Code](../src/array_of_objects/)

### Object passing

In Java, when objects are passed to methods, what is actually passed is a reference to the object, not the object itself. This means that if you modify the object inside the method, the changes will be reflected in the original object outside the method. This behavior facilitates the manipulation of objects across different parts of a program without the need to copy or recreate objects.

[Code](../src/object_passing/)

## static keyword

The `static` keyword in Java is used to indicate that a particular field, method, or block belongs not to any instance of a class, but to the class itself. Static members are shared among all instances of a class, making them ideal for defining constants or utility functions that are common to all objects of that class. Additionally, static blocks can be used for static initialization of a class. This keyword plays a crucial role in memory management by reducing the amount of memory required for common data and methods shared by objects.

[Code](../src/static_keyword/)

## Inheritance

This concept allows a class to inherit properties and methods from another class. The class that inherits is called the `subclass` or `child class`, while the class from which properties are inherited is known as the `superclass` or `parent class`. Inheritance promotes code reuse and establishes a hierarchical classification of classes, which is crucial for organizing complex software systems.

[Code](../src/inheritance/)

### Method overriding

Method overriding occurs in Java when a subclass provides a specific implementation for a method that is already defined in its superclass. This mechanism allows a subclass to modify the behavior of the superclass method according to its needs. Overriding ensures that the subclass can offer a more specific behavior for the inherited methods, enhancing the `polymorphism` feature of Java.

[Code](../src/method_overriding/)

### super keyword

The `super` keyword in Java is used within a subclass to refer to its parent class. It can be used to call methods and constructors of the parent class that may be overridden or hidden in the subclass. The `super` keyword is instrumental in accessing and invoking the parent class's behaviors, ensuring that the subclass can leverage and extend the functionalities of its superclass.

[Code](../src/super_keyword/)

## Abstraction

Abstraction in Java is a process of hiding the implementation details and showing only the functionality to the users. It can be achieved with abstract classes and interfaces. Abstract classes cannot be instantiated, but they can have abstract methods, which are methods without bodies. These methods must be implemented by subclasses. Abstraction helps in reducing complexity and allows the programmer to focus on interactions at a higher level.

[Code](../src/abstraction/)

## Access modifiers

Access modifiers in Java determine the accessibility or scope of a field, method, constructor, or class. There are four types of access modifiers: `private`, `protected`, `public`, and default (no modifier).
`Private` members are accessible only within the same class,
`protected` members within the same package or subclasses,
and `public` members from any class.
The default modifier means the member is accessible only within its own package. Access modifiers are fundamental for encapsulation in Java.

[Code](../src/access_modifiers/)

## Encapsulation, getters and setters

Encapsulation is one of the four fundamental OOP concepts. It is the technique of making the fields in a class private and providing access to the fields via public methods. It's a way to protect the data from unauthorized access and modification. Encapsulation in Java is achieved using access modifiers, ensuring that sensitive data is hidden from users and can be accessed only through designated methods.

[Code](../src/encapsulation/)

## Copy objects

Copying objects in Java can be achieved through several methods, including cloning (using the `clone()` method), copy constructors, and copying through serialization. Each method has its own use cases and considerations regarding deep and shallow copying.

[Code](../src/copy_objects/)

## Interface

An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructor methods. They are used to specify a set of methods that a class must implement, providing a way to achieve abstraction and multiple inheritance in Java.

[Code](../src/interfaces/)

## Polymorphism

Polymorphism is the ability of an object to take on many forms. In Java, this means that a single interface can be used to represent different underlying forms of an object. This is one of the core concepts of OOP and allows for actions to be performed in different ways, based on the actual object that the action is being performed on. Polymorphism in Java is mainly divided into two types: compile-time (static) and runtime (dynamic) polymorphism.

[Code](../src/polymorphism/)

## Dynamic polymorphism

Dynamic polymorphism, also known as runtime polymorphism, is achieved in Java through method overriding. This occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass. At runtime, the Java Virtual Machine (JVM) determines which method to execute based on the object's runtime type, allowing for dynamic method dispatch.

[Code](../src/dynamic_polymorphism/)
