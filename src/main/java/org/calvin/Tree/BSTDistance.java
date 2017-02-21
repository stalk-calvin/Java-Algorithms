/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

public class BSTDistance {
    public static boolean found = false;

    public static int bstDistance(int[] values, int n, int node1, int node2) {
        // WRITE YOUR CODE HERE
        // Build Tree
        TreeNode root = new TreeNode(values[0]);
        for (int i = 1; i < n; i++) {
            root.insertInOrder(values[i]);
        }

        //Now Lets analyze
        int actual = findDistance(root, node1, node2);
        if (!found) {
            return -1;
        } else {
            return actual;
        }
    }

    private static int findDistance(TreeNode root, int node1, int node2) {
        if (root == null || node1 == node2) return 0;

        int leftD = findDistance(root.left, node1, node2);
        int rightD = findDistance(root.right, node1, node2);

        if (leftD > 0) {
            if (rightD > 0) {
                found = true;
                return leftD + rightD;
            }
            if (root.val == node1 || root.val == node2) {
                found = true;
                return leftD;
            }
        }
        if (rightD > 0) {
            if (root.val == node1 || root.val == node2) {
                found = true;
                return rightD;
            }
        }

        if (leftD == 0 && rightD == 0) {
            if (root.val != node1 && root.val != node2) return 0;
            return 1;
        } else {
            if (found && leftD > 0) return leftD;
            if (found && rightD > 0) return rightD;
            return Math.max(leftD, rightD) + 1;
        }
    }
}
