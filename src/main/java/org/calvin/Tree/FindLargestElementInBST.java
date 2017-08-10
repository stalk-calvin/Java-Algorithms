package org.calvin.Tree;

public class FindLargestElementInBST {
    public int largest(TreeNode n) {
        if (n.getRight() == null) {
            return n.getVal();
        }
        return largest(n.right);
    }

    public int secondLargest(TreeNode n) {
        if (n == null || n.left == null && n.right == null) {
            return -1;
        }
        TreeNode current = n;
        while (current != null) {
            if (current.left != null && current.right == null) {
                return largest(current.left);
            }
            if (current.right != null && current.right.left == null && current.right.right == null) {
                return current.getVal();
            }
            current = current.right;
        }
        return -1;
    }
}
