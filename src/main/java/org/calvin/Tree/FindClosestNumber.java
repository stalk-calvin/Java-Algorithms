/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class FindClosestNumber {
    public static class Closest {
        int val = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
    }
    public void findClosest(TreeNode n, Closest c, int x) {
        if (n == null) {
            return;
        }
        if (Math.abs(n.getVal() - x) < c.min) {
            c.val = n.getVal();
            c.min = Math.abs(n.getVal() - x);
        }
        findClosest(n.left, c, x);
        findClosest(n.right, c, x);
    }
}
