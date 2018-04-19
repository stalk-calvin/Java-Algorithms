# Binray Tree to Heap

## Problem

You are given a set of integers in an unordered binary tree.
Use an array sorting routine to transform the tree into a heap that uses a balanced binary tree as its underlying data structure.

## Analysis

If not for the requirement to use an array sorting routine, it would be more effcient to simply heapify the nodes of the start tree: that is reorder them such that they meet the criteria of a heap.
Heapify the tree can be O(n) time, while just the array sort is at least O(nlog(n)).

But the problem includes an arbitrary restriction to force you to demonstrate certain skills -  here, it's the ability to transform between tree and array data structures.

The first task is to convert the tree into an array. We need to visit each node to insert its associated value into your array. It can be accomplished with a tree traversal.
One wrinkle(assuming use static arrays) is that we have to allocate the array before put anything in it, but we don't know how many values there are in the tree befoer traverse it. This is solved by traversing the tree twice: once to count the nodes and a second time to insert the values in the array.

After the array has been filled, a simple call to the sorting routine yields a sorted array.

The marjor challenge of this problem is to construct the heap from the sorted array.

The essential property of a heap is the relationship between the value of each node and the values of its childre: less than or equal to the children for a min-heap and greater than or equal for a max-heap.

The problem doesn't specify a min-heap or max-heap. We'll arbitrarily choose to construct a min-heap, because each value in the sorted array is less than or equal to all the values that follow it.

    0 1 2 3 4 5 6 7 8
            
             0
           /   \
          1     2
         / \   / \
        3  4  5   6
       / \
      7  8


