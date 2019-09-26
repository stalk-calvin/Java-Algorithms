/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && root.val == sum) // Leaf check
            return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public int calculate_path_sum(TreeNode tree, int to, int current) {
        if (tree == null) {
            return 0;
        }
        current += tree.val;

        int total = 0;
        if (to==current) {
            total = 1;
        }

        total += calculate_path_sum(tree.left, to, current);
        total += calculate_path_sum(tree.right, to, current);

        return total;
    }

    List<String> showPathSum(TreeNode root, int target) {
        List<String> answer = new ArrayList<String>();
        if (root != null) gatherPathSum(root, target, "", answer);
        return answer;
    }

    private void gatherPathSum(TreeNode root, int sum, String path, List<String> answer) {
        if (root == null)
            return;

        if (root.left == null && root.right == null && root.val == sum) {
            answer.add(path + root.val);
            return;
        }

        gatherPathSum(root.left, sum - root.val, path + root.val + "->", answer);
        gatherPathSum(root.right, sum - root.val,path + root.val + "->", answer);
    }
}
