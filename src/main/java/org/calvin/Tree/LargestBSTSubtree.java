/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.Tree;

class Wrapper {
    int size;
    int lower, upper;
    boolean
            isBST;

    public Wrapper() {
        lower = Integer.MAX_VALUE;
        upper = Integer.MIN_VALUE;
        isBST = false;
        size = 0;
    }
}

public class LargestBSTSubtree {
    public int largestBSTSubtree(TreeNode root) {
        return helper(root).size;
    }
    private Wrapper helper(TreeNode node) {
        Wrapper curr = new Wrapper();

        if (node == null) {
            curr.isBST = true;
            return curr;
        }

        Wrapper left = helper(node.left);
        Wrapper right = helper(node.right);

        curr.lower = Math.min(node.val, left.lower);
        curr.upper = Math.max(node.val, right.upper);

        if (left.isBST && right.isBST && left.upper <= node.val && right.lower >= node.val) {
            curr.size = left.size + right.size + 1;
            curr.isBST = true;
        } else {
            curr.size = Math.max(left.size, right.size);
            curr.isBST = false;
        }

        return curr;
    }
}
