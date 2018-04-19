# Preorder Traversal, No Recursion

## Problem

Perform a preorder traversal of a binary search tree,  printing the value of each node, but this time you may not use recursion.

## Analysis

Sometimes recursive algorithms can be replcaed with iterative algorithm that accomplish the same task in a fundamentally different manner using different data structures.

Understand what is happening in the recursion and try to emulate the process iteratively.
Recursion implicitly uses a stack data structure by placing data on the call stack.

The recursuve call serves to implicitly store the address of the right subtrrr on the stack, so it can be traversed after the left subtree traversal is complete.

Instead of coding separate cases for the left and right children, why not push pointers to both nodes onto the stack?

Because a stack is a last-in-first-out data structure, push the right node onto the stack first, followed by the left node. Instead of examining the left child explicitly, simply pop the first node from the stack, print its value, and push both of its children onto the stack in the correct order.

    Create the stack
    Push the root node on the stack
    While the stack is not empty
        Pop a node
        Print its value
        If right child exists, push the node's right child
        If left child exists, push the nodes's left child

