# Advanced Java

## Generics

Generics in Java enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. This feature provides stronger type checks at compile time and eliminates the need for casting, making the code safer and easier to read. Generics also enable developers to implement generic algorithms that work on collections of different types, providing more reusability and abstraction.

[Code](../src/generics/)

### HashMap

The `HashMap` in Java is a part of the Collections Framework. It stores items in "key/value" pairs, and you can access them by an index of another type (e.g., an Integer). One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like String keys and String values. HashMaps are efficient for locating a value based on a key and inserting and deleting values based on a key. The keys are unique in a Map, and each key maps to exactly one value.

## Bounded Types

Bounded types in Java Generics restrict the types that can be used as type arguments in a parameterized type. By specifying an upper bound, you can declare a type parameter to accept only values of a certain type or its subclasses, ensuring API flexibility while maintaining type safety. This is particularly useful in enforcing constraints on generic types at compile time.

[Code](../src/bounded_types/)

## Serialization

Serialization in Java is a mechanism of converting the state of an object into a byte stream, making it possible to save objects to a file or send them over a network. Conversely, deserialization is the process of converting the byte stream back into a copy of the object. This feature is crucial for persisting the state of an object or for transmitting objects between different parts of a system in a platform-independent manner.

[Code](../src/serialization/)
