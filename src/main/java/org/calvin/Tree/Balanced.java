/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class Balanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int diff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(diff) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
