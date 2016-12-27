## Cycle

Given a linked list, determine if it has a cycle in it.

## Cycle 2

Given a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

Note: Do not modify the linked list.

## DeleteNode

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is `1 -> 2 -> 3 -> 4` and you are given the third node with value `3`, the linked list should become `1 -> 2 -> 4` after calling your function.

## Intersection

Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:

```
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
```
begin to intersect at node c1.

## LRUCache

Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: `get` and `set`.

`get(key)` - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.  
`set(key, value)` - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

## Merge2SortedList

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

## MergeKSortedLists

Merge *k* sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

## Palindrome

Given a singly linked list, determine if it is a palindrome.

## RemoveElement

Remove all elements from a linked list of integers that have value val.

Example

```
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
```

## RemoveLastNthNode

Given a linked list, remove the *n*<sup>th</sup> node from the end of list and return its head.

For example,

```
   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
```

## ReverseList

Reverse a singly linked list.

## SwapNode

Given a linked list, swap every two adjacent nodes and return its head.

For example,  
Given `1->2->3->4`, you should return the list as `2->1->4->3`.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.