# Bugs in removeHead

## Problem

Find and fix the bugs in the following C function that is suppoesd to remove the head element from a singly linked list.

    void removeHead(listElement *head) {
        free(head);         // Line 1
        head = head->next;  //Line 2
    }

## Analysis

General strategy

It's litte differeent from real-world programming.
Don't need worry about interactions withe other modules or other parts of the program.
Instead, must do a systematic analysis of every line of the function without the help of a debugger.

1. Chcek that the date comes into the function properly. Make sure that you aren't accessing a variable that you don't have, you aren't reading something as an int that should be a long, and you have all the values you neeed to perform the task.

2. Check that each line of the function works correctly. The function is intended to perform a task. Verify that the task is executed correctly at each line and that the desired result is produced at the end.

3. Check that the data comes out of the function correctly. The return value should be what you expect. In addition, if the function is expected to update any caller variables, make sure this occurs.

4. Check the common error condtion. Error conditions vary depending on the specifics of a problem. They tend to involve unusual argument values. For instance, functions that operate on data structures may have trouble with empty data structures; functions that take a pointer as argument may fail if passed a null pointer.

### check the data comes into the function

In a linked list, we can access every element given only the head. -no bugs so far.

### Line-by-line analysis.

Line 1, free head, ok
Line 2, assign a new value to head but use the old value of head - wrong.

    void removeHead(ListElement *head) {
        ListElement *temp = head->next; // Line 1
        free(head);                     // Line 2
        head = temp;                    // Line 3
    }

### Make sure function return values properly

Though there is no  explict return value, there is an implicit one.
The function is supposed to update the caller's `head` value.
In C, all function parameters are passed by value, so functions get a local copy of each argument, and any changes made to that local copy are not reflected outside the function.
Variables cannot passed by reference in C, so the solution ispass a pointer to the variable you want to change.

    void removeHead(ListElement **head) {
        ListElement *temp = (*head)->next;  // Line 1
        free(*head);                        // Line 2
        *head = temp;                       // Line 3 
    }

### Check error condition

null pointer - on Line 1, dereference a null pointer
zero-element list - is simplya null pointer
one-element list - ok

    void removeHead(ListElement **head) {
        ListElement *temp;
        if (head && *head) {
            temp = (*head)->next;
            free(*head);
            *head = temp;
        }
    }

