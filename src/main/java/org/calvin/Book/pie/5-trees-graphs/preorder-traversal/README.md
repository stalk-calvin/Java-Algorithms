# Preorder Traveral

## Problem

Informally, a preorder traversal involves walking around the tree in a counter-clockwise manner starting at the root, sticking close to the edges, and printing out the nodes as you encounter them.
For the following tree, the result is 100, 50, 25, 75, 150, 125, 110 and 175.

              100
             /   \
            50    150
           / \   /  \
          25 75 125 175
                /
               110

Perform a preorder traversal of a binary search tree, printing the value of each node.

## Analysis

Print the node itself, followed by the left subtree and then the right subtree.

    print out the root (or the subtres's root) value.
    do a preorder traversal on the left subtree.
    do a preorder traversal on the right subtree.


    void preorderTraversal(Node root) {
        if (root == null) return;
        root.printValue();
        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());
    }

Every node is examined once, so the runtime is O(n).

The `inorder` and `post` order traversal are almost identical, all you vary is the order in which the node and subtrees are visited.

    void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.getLeft());
        root.printValue();
        inorderTraversal(root.getRight());
    }

    void postorderTraversal(Node root) {
        if (root == null) return;
        postorderTraversal(root.getLeft());
        postorderTraversal(root.getRight());
        root.printValue();
    }

