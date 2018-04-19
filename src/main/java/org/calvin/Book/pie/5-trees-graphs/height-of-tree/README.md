# Height of a Tree

## Problem

The height of a tree(binary or not) is defined to be the maximum distance from the root node to any leaf node.

Write a function to calculate the height of an arbitrary binary tree.

## Analysis

Start by lookoing ar some simple trees to see if there's a way to think recusively about the problem.

The height of a tree equals the height of its tallest subtree plus one.

    public static int treeHeight(Node n) {
        if (n == null) return 0;
        return 1 + Math.max(treeHeight(n.getLeft()),
                            treeHeight(n.getRight()));
    }
