/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public void mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        Queue<TreeNode> tracker = new LinkedList<>();
        tracker.add(root);
        while (!tracker.isEmpty()) {
            TreeNode t = tracker.poll();
            if (t != null && t.left != null && t.right != null) {
                TreeNode tmp = t.left;
                t.left = t.right;
                t.right = tmp;
                tracker.add(t.left);
                tracker.add(t.right);
            }
        }
    }
}
