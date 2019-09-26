# Maintain Linked List Tail Pointer

## Problem

`head` and `tail` are global pointers to the first and last element, respectively, of a singly linked list of integers.
Implement C functions for the following prototypes:

    bool delete(Element *elem);
    bool insertAfter(Element *elem, int data);

The argument to delete is the element to be deleted.
The two arguments to `insertAfter` give the element after which the new element to be inserted and the data for the new element. It should be possible to insert at the begining of the list by calling `insertAfter` with `NULL` as the element argument.
These funtions should return a boolean indicating success.

Your functions must keep the head and tail pointer current.

## Analysis


