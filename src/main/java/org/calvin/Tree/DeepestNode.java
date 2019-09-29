package org.calvin.Tree;

public class DeepestNode {
    static TreeNode findDeepestNode(TreeNode root) {
        TreeNode DeepestNode = new TreeNode(-1);
        int[] counter = new int[1];
        counter[0] = 0;
        helper(root, 0, counter, DeepestNode);
        return DeepestNode.right;
    }

    private static void helper(TreeNode root, int tracker, int[] counter, TreeNode n) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && counter[0] < tracker) {
            counter[0] = tracker;
            n.right = root;
        }
        helper(root.left, tracker+1, counter, n);
        helper(root.right, tracker+1, counter, n);
    }
}
