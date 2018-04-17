### Chain of Responsibility

Avoid coupling the sender of a request to its receiver by giving more
than one object a chance to handle the request. Chain the receiving
objects and pass the request along the chain until an object handles it.

Request enters from one end and keeps going from object to object till
it finds the suitable handler.

### ComparatorComparable

Simple illustration of how comparisons handled in Java

### Iterator

Provide a way to access the elements of aggregate object sequentially
without exposing its underlying representation.

### Mediator

Define an object that encapsulates how a set of objects interacts.
Mediator promotes loose coupling by keeping objects from referring to
each other explicitly, and it lets you vary their interaction independently.

### NullObject

references can be null. Must be checked to ensure they are not null
each time. Instead use null reference to convey absence of an object

### Observer

Define a one-to-many dependency between objects so that when one object
changes state, all its dependents are notified and updated automatically

### Strategy

Define a family of algorithms, encapsulate each one and make them
interchangeable. Strategy lets the algorithms vary independently from
clients that use it.

### Visitor

Represent an operation to be performed on the elements of an object
structure. Visitor lets you define a new operation without changing
the classes of elements on which it operates
