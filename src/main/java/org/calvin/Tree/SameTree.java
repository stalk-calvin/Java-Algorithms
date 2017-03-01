/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return !((p == null && q != null) || (q == null && p != null))
                && (p == null && q == null || p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
