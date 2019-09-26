# Unbalanced Binary Search Tree

## Problem

Given an unbalanced binary search tree with more nodes in the left subtree than the right, reorganize the tree to improve its balance while maintaining the properties of a binary search tree.

## Amalysis

This would be a trivial problem with a binary tree, but the requirement to maintain the ordering of a BST make it more complex.

It may be helpful to start by drawing a simple example of an unbalanced binary search tree.

                6
               / \
              4   7                    4
             / \                     /   \
            2   5                   2     6
           / \                     / \   / \
          1   3                   1   3 5   7

Since there are too many nodes on the left and not enough on the right, you need to move some nodes from the left subtree of the root to the right subtree.
For the tree to remain a BST, all of the nodes in the left subtree of the root should be less than or equal to the root, and all the nodes in the right subtree greater than or equal to the root.

In this example, there is only one node(7) that is greater than the root(6), so we won't be able to move any nodes to the right subtree if 6 remain the root.
In a balanced BST, half of the nodes are less than or equal to the root and half are greater or equal.  This suggest that 4 would be a good choice for the new root.

Set the left child(4) as the new root, and the the origin root(6) as right child of new root, set the origin right child(5) of new root as the left child of origin root.

Will this approach work for more complex trees?
In fact, the "root" in the example is actually a child of a larger tree and the "leves" in the example are actually parents and have additional nodes beneath them.
