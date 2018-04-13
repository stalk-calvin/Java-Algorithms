## Traversal

Shows Preorder, Inorder, Postorder Depth First Search and Breath First Search using Binary Tree

## Trie

Shows basic implementation of Trie

## Balanced

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

## BFS

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

return its level order traversal as:

```
[
  [3],
  [9,20],
  [15,7]
]
```

## BFS2

Given a binary tree, return the *bottom-up* level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

return its bottom-up level order traversal as:

```
[
  [15,7],
  [9,20],
  [3]
]
```

## EqualTree

Given two binary trees, can you write a method to check if this trees are equals?

## ExtractBinaryTreeLeaveDoubleLinkedList

Given a Binary Tree, extract all leaves of it in a Doubly Linked List (DLL).

Note that the DLL need to be created in-place. Assume that the node structure of DLL and Binary Tree is same,
only the meaning of left and right pointers are different. In DLL, left means previous pointer and right means next pointer.

```
Let the following be input binary tree
        1
     /     \
    2       3
   / \       \
  4   5       6
 / \         / \
7   8       9   10


Output:
Doubly Linked List
7<->8<->5<->9<->10

Modified Tree:
        1
     /     \
    2       3
   /         \
  4           6
```

## FindClosestNumber

Find a distance between the closest node to the given integer, *x*.

## FindLargestElementInBST

Find largest element from BST and second largest as well

## FindMinNumberAtPosition

Given a Binary Search Tree, can you write a method to obtain the *n*th min element?

## InvertTree

Invert a binary tree.

```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```

to

```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

## LargestBSTSubtree

Given a binary tree, find the largest subtree which is a BST where largest means subtree with
largest number of nodes in it.

## LCABST

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow **a node to be a descendant of itself**).”

```
        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
```
         
For example, the lowest common ancestor (LCA) of nodes `2` and `8` is `6`. Another example is LCA of nodes `2` and `4` is `2`, since a node can be a descendant of itself according to the LCA definition.

## LCABT

Given a binary tree (not a binary search tree) and two values say n1 and n2, write a program to find the least common ancestor.

## MaxDepth

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Merge Two Binary Trees

Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example:
```
Input:

Tree 1,
     1
   /   \
  3     2
 /
5 

Tree 2,
     2
   /   \
  1     3
   \     \
    4    7
    
Output:
     3
   /   \
  4     5
 / \     \
5   4     7
```

## MinDepth

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

## Path

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

```
   1
 /   \
2     3
 \
  5
```

All root-to-leaf paths are:

`["1->2->5", "1->3"]`

## PathSum

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and `sum = 22`,

```
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
```

return true, as there exist a root-to-leaf path `5->4->11->2` which sum is 22.

## SameTree

Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

## Symmetric

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree `[1,2,2,3,4,4,3]` is symmetric:

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

But the following `[1,2,2,null,3,null,3]` is not:

```
    1
   / \
  2   2
   \   \
   3    3
```

## TreeDiameter

Given a binary tree which has T nodes, you need to find the diameter of that binary tree. The diameter of a tree is
the number of nodes on the longest path between two leaves in the tree.

```
    1
   / \
  2   2
   \   \
   3    3
```

above example should output 5 for the path, 3-2-1-2-3
