### AbstractFactory

Provide an interface for creating families of related or dependent objects
without specifying their concrete classes.

### Builder

Separate the construction of a complex object from its representation
so that the same construction process can create different representation

### Factory

Simple factory model where it creates object based on the name of the
object. It provides an interface for what model should at least have.

### Prototype

Specify the kinds of objects to create using a prototypical instance,
and create new objects by copying this prototype.

### Singleton

Ensure a class only has one instance, and provide a global point of
access to it.

### StaticFactory

Benefits:

1. they have informative name
2. not required to create a new objects (cached info, flyweight pattern)
3. can return an object of any subtype if their return type
4. reduce the verbosity of creating parameterized type instances

Cons:

1. cannot be subclassed without public or protected constructors
2. not readily distinguishable from other static methods
