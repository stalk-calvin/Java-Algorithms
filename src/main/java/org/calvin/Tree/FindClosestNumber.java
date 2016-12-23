package org.calvin.Tree;

public class FindClosestNumber {
    public int findClosest(TreeNode n, int x) {
        int closest = Integer.MAX_VALUE;
        if (n == null) {
            return -1;
        }
        closest = Math.min(closest, Math.abs(n.getVal() - x));
        findClosest(n.left, x);
        findClosest(n.right, x);
        return closest;
    }
}
