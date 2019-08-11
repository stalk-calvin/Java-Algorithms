package org.calvin.Tree;

public class MaxDia {
    private static int maxDia;
    static int  calcMaxDia ( int[] tree , int nodeIndex ) {
        if (nodeIndex < 0 || nodeIndex >= tree.length) {
            return 0;
        }else {
            int leftSum = calcMaxDia(tree, nodeIndex * 2);
            int rightSum = calcMaxDia(tree, nodeIndex * 2 + 1);
            int current = tree[nodeIndex];
            return Math.max(leftSum + rightSum, Math.max(leftSum, rightSum)) + current;
        }
    }
}
