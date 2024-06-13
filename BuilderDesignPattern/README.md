## Builder Pattern

### Definitions.

Builder pattern is used in the scenario when an object can have too many variations. Without builder pattern, in this scenario, either we end up creating multiple subclasses for every variation of object, or creating a constructor with multiple nullable arguments.
The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.

1. Products: Trailer and Movie are the products, the products can be different from each other an need not follow an interface
2. builder interface: Builder class that has all the common methods required for concrete builders
3. Movie Builder and Trailer Builder: concrete builder classes, they provide own implementation of steps in Builder class and return their own Product type as result
4. Director: this class defines the order of methods of builder class that need to be followed for creation of objects
5. BuilderPattern: client code that creates a director class, and gives builder class as arguments, the methods of the builder objects are called in director method in an order
