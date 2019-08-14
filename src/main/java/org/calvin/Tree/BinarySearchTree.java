package org.calvin.Tree;

import java.util.ArrayList;
import java.util.List;

class BinarySearchTree {
    // Root of BST
    TreeNode root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    void insertIterative(int val) {
        TreeNode n = new TreeNode(val);
        if (root == null) {
            root = n;
        } else {
            TreeNode current = root;
            while (current != null) {
                TreeNode tmp = current;
                if (current.val > val) {
                    current = current.left;
                    if (current == null) tmp.left = n;
                } else {
                    current = current.right;
                    if (current == null) tmp.right = n;
                }
            }
        }
    }

    // This method mainly calls insertRec()
    void insert(int val) {
        root = insertRec(root, val);
    }

    /* A recursive function to insert a new val in BST */
    TreeNode insertRec(TreeNode root, int val) {
        /* If the tree is empty, return a new TreeNode */
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);

        /* return the (unchanged) TreeNode pointer */
        return root;
    }

    List<Integer> inorder()  {
        List<Integer> result = new ArrayList<>();
        inorderRec(root, result);
        return result;
    }

    // A utility function to do inorder traversal of BST
    private void inorderRec(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorderRec(root.left,result);
            result.add(root.val);
            inorderRec(root.right,result);
        }
    }

    void delete(int val) {
        deleteRec(root, val);
    }

    TreeNode deleteRec(TreeNode TreeNode, int val) {
        if (TreeNode==null) {
            return null;
        } else if (TreeNode.val < val) {
            TreeNode.right = deleteRec(TreeNode.right, val);
        } else if (TreeNode.val > val) {
            TreeNode.left = deleteRec(TreeNode.left, val);
        } else {
            // when one side is null
            if (TreeNode.left == null && TreeNode.right == null) {
                TreeNode = null;
            } else if (TreeNode.left == null) {
                return TreeNode.left;
            } else if (TreeNode.right == null) {
                return TreeNode.right;
            }
            // when both not empty, we have to recurse
            else {
                // Find the minimum node on the right (could also max the left...)
                TreeNode minRight = minValue(TreeNode.right);

                // Duplicate it by copying its values here
                TreeNode.val = minRight.val;

                // Now go ahead and delete the node we just duplicated (same key)
                TreeNode.right = deleteRec(TreeNode.right, minRight.val);
            }
        }
        return TreeNode;
    }

    TreeNode minValue(TreeNode root)
    {
        while (root.left != null)
        {
            root = root.left;
        }
        return root;
    }
}