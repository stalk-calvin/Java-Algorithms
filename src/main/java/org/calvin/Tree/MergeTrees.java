/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        int rootVal = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newTree = new TreeNode(rootVal);
        newTree.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newTree.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return newTree;
    }
}
