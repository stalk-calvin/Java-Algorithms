# Lowest Common Ancestor

## Problem

Given the value of two nodes in a binary search tree, find the lowest(nearest) common ancestor.
You may assume that both values already exist in the tree.

For example, using the following tree. 

                20
               /  \
              8    22
             / \
            4  12
               / \
              10 14

Assume 4 and 14 are the two given nodes. The lowest common ancestor would be 8 becauese it's an ancestor to both 4 and 14, and there is no node on the tree that is an ancestor to both 4 and 14.

## Analysis

Binary  search tree: left <= root <= right

    if value > value1 and value > value2
        curr = curr.getLeft()
    else if value < value1 and value < value2
        curr = curr.right()
    else
        return curr

