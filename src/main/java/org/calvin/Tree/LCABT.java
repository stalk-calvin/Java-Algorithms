/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class LCABT {
    public TreeNode lca(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null) {
            return null;
        }
        if (root.equals(a) || root.equals(b)) {
            return root;
        }
        TreeNode left = lca(root.left, a, b);
        TreeNode right = lca(root.right, a, b);
        if (left != null && right != null ) return root;
        if (left == null) return right;
        else return left;
    }
}
