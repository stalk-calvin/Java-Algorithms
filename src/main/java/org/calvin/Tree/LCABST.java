/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class LCABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) { //search right
                root = root.right;
            } else if (root.val > p.val && root.val > q.val) { //search left
                root = root.left;
            } else { //found
                return root;
            }
        }
        return null;
    }

    public TreeNode lowestCommonAncestorMyWay(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestorMyWay(root.left, p, q);
        } else if (root.val < p.val && root.val< q.val) {
            return lowestCommonAncestorMyWay(root.right, p, q);
        } else {
            return root;
        }
    }
}
