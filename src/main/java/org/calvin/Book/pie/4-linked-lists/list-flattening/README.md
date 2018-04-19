# List Flattening

## Problem

Start with a standard doubly linked list.
Now imagine that in addition to the next and previous pointers, each element has a child pointer, which may or may not pointer to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure.

Flatten the ist so that all the nodes appear in a single-level, doubly linked list.
You are given the head and tail of the first level of the list. Each node is a C struct with the following definition:

    typedef struct Node {
        struct Node *next;
        struct Node *prev;
        struct Node *child;
        int         value;
    } Node;

## Analysis


    Start at the begining of the first level
    while not at then end of first level
        If the current node has a child
            Append the child to the end of the first level
            Update the tail pointer(the end of the child list)
        Advance to next node
