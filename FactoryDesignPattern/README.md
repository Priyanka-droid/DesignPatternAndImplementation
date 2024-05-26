## Factory Pattern

### Definitions.

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created
1. Creator: The Creator class declares the factory method that returns new product objects. It’s important that the return type of this method matches the product interface.
2. Concrete Creators override the base factory method so it returns a different type of product. 
3. The Product declares the interface, which is common to all objects that can be produced by the creator and its subclasses. 
4. Concrete Products are different implementations of the product interface.
