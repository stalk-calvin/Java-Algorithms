# Null or Cycle

## Problem

You are given a linked list with at least one node that is either null-teminated(`acyclic`), or ends in a cycle(`cyclic`).

Write a function that takes a pointer to the head of a list and determines whether the list is cyclic or acyclic.
Your function shoudl return `false` if the list is acyclic and `true` is it is cyclic. You may not modify the list in any way.

## Analysis

For a `acyclic` list, it's eay for us to find the end node.

For a `cyclic` list, it's difficult to find the end node. Maybe we can mark each element when we visit it, but here we are not allowed to modify the list.

Another way is compare current node's next pointer to all its previous nodes directly.

A better solution is using two pointers with different speeds.
In the acyclic list, the faster pointer reaches the ends.
In the cyclic list, they both loop endlessly. The faster pointer eventually catches up with and passes the slower pointer.


