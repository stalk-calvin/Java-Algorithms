# Stack Implementation

## Problem

Discuss the stack data structure.
Implement a stack in C using either a linked list or a dynamic array, and justify your decision.
Design the interface to your stack to be complete, consistent, and easy to use.

## Analysis

### Purpose

The problem is designed to determine three things:
1. Your knowledge of basic data structures
2. Your ability to write routines to manipulate these structures
3. Your ability to design consistent interfaces to a group of routines

A `Stack` is a last-in-first-out(LIFO) data structure.
The add element and remove element operations are conventionally called `push` and `pop`, respectively.

Stacks are useful data structures for tasks that are divided into multiple subtasks.
Tracking return addresses, parameters, and local variables for subroutines is one example for stack use; tracking tokens when parsing a programming language is another.

### Chose dynamic array or linked list?

Dynamic array
Advantages: random acces to the array elements.
Disadvantages:
1) Operation on a stack always work on one end of the data structure(the top of the stack).
2) As a dynamic array grows, it must occasionally be resized, which can be a time-consuming operation as elements are copied from the old array to the new array.

Linked lists usually allocate memory dynamically for each element.
Disadvantages:
Depending on the overhead of the memory allocator, these allocations are often more time consuming than the copues required by a dynamic array, so a stack based on a dynamic array is usually faster than the one based on a linked list.
Advantages:
Implementing a linked list is less complicated than implementing a dynamic array, so in an inreview, a linked list is probably the best choice for your solution.

### Design the routines and their interfaces

Take a moment to design your code before writing it.

__What will the prototype for thest funtions be?__

The stack will need `push` and `pop` routines. 

Each function must be passed the stack it operates on.
The `push` operation will be passed the data it is to push, and `pop` will return a piece of data from the stack.

What type of data will be stored in the stack?
We should declare a `struct`for a linked list element with the appropriate data type.

    typedef struct Element {
        struct Element *next;
        void *data;
    } Element;

Initial design

    void push(Element **stack, void *data);
    void *pop(Element **stack)

**Note**: We should pass a pointer to a pointer of the stack.

__What about error handling?__

The push operation needs to dynamically allocate memory for a new element. It might failed.

Can `pop` fail? It doesn't have to allocate memory, but what it might failed when asked to pop an empty stack?
The pop need return two value: the data it poped and an error code.

The problem has a number of possible solutions, non of which are entirely satisfactory.

One approach is to use the single return value for both purpse.
1) Return the data if pop is successful, else return NULL. 
2) Return a special value represent a valid piece of data - a pointer to a reserved memory block, for example, or (for stacks dealing with nonnegativ enumbers only) a negtive value.

If we want to return two distinct value: by passing a pointer to a varibale.
1) Take a pointer to an error code variable as an argument and return the data 
2) Take a pointer to the data variable and return an error code.

Intuitively, most programmers would expect pop to return data. However, using pop is awkward if the error code is not its return value: you must explicitly declare a variable for the error code and check its value in a separate staement. 
Furthermore, push would take a data argument and return an error code, whereas pop would take an error code argument and return data. This may offend your sense of symmetry.

    bool push(Element **stack, void *dta);
    bool pop(Element **stack, void **data);

    bool createStack(Element **stack);
    bool deleteStack(Element **stack);

