package org.calvin.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagonalDistance {
    public static List<List<Integer>> diagonalDistance(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        List<Integer> tmp = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            if (p == null) {
                result.add(tmp);
                tmp = new ArrayList<>();
                queue.add(null);
                p = queue.poll();
                if (p == null) break;
            }
            while (p != null) {
                tmp.add(p.val);
                if (p.left != null) {
                    queue.add(p.left);
                }
                p = p.right;
            }
        }
        return result;
    }
}
