/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class EqualTree {
    public boolean isEqualRecursive(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else
            return !(tree1 == null || tree2 == null)
                    && tree1.equals(tree2)
                    && isEqualRecursive(tree1.getLeft(), tree2.getLeft())
                    && isEqualRecursive(tree1.getRight(), tree2.getRight());
    }

    /* Iterative using BFS */
    public boolean isEqualIterative(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(tree1);
        q2.add(tree2);
        while (!(q1.isEmpty() && q2.isEmpty())) {
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();
            if (node1 != null && !node1.equals(node2)) {
                return false;
            }
            if (node2 != null && !node2.equals(node1)) {
                return false;
            }
            if (node1 != null) {
                if (node1.getLeft() != null) {
                    q1.add(node1.getLeft());
                }
                if (node1.getRight() != null) {
                    q1.add(node1.getRight());
                }
            }

            if (node2 != null) {
                if (node2.getLeft() != null) {
                    q2.add(node2.getLeft());
                }
                if (node2.getRight() != null) {
                    q2.add(node2.getRight());
                }
            }
        }

        return true;
    }
}
