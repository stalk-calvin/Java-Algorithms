/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree.Traversal;

import org.calvin.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<Integer> findBFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> tracker = new LinkedList<>();
        tracker.add(root);
        while(!tracker.isEmpty()) {
            TreeNode node = tracker.remove();
            result.add(node.getVal());
            if (node.left != null) {
                tracker.add(node.left);
            }
            if (node.right != null) {
                tracker.add(node.right);
            }
        }
        return result;
    }
}
