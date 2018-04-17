package org.calvin.Tree;

import java.util.ArrayList;
import java.util.List;

public class ViewOfBT {
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(res, root, 0);
        return res;
    }

    public void helper(List<Integer> res, TreeNode root, int level) {
        if(root == null) return;
        if(res.size() == level)
            res.add(level, root.val);
        helper(res, root.right, level + 1);
    }
}
