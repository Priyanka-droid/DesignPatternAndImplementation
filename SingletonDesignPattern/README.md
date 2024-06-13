## Singleton Pattern

### Definitions.

Singleton design pattern insures that a class has only one instance, and provides global access to this instance.
It is used in the scenarios when there are shared resources, for example, a database or a file.
Only creates an instance when it does not exist already, it cannot be achieved with regular constructor, because regular constructor always return a new object
It provides an alternative for global variable, but it is safer, since global variables can be changed but singleton instance can not be overwritten from otehr piece of code.

Implementation:
1. make the default constructor as private to prevent object creation by using "new"
2. create a static method which acts as constructor, this method calls the default private constructor to create a new object and saves that object in a static "instance" field 
