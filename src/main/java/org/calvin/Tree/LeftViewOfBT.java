package org.calvin.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeftViewOfBT {
    public List<Integer> getLeftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        helper(root, result);
        return result;
    }

    private boolean helper(TreeNode root, List<Integer> result) {
        if (root == null) return true;
        result.add(root.val);
        if (root.left == null && root.right == null) {
            return false;
        }
        return helper(root.left, result) && helper(root.right, result);
    }
}
