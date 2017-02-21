/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import java.util.ArrayList;
import java.util.List;

public class FindMinNumberAtPosition {

    // Find inorder and find nth element from the least,
    // O(N) solution where N is number of nodes
    public TreeNode findNthMin(TreeNode root, int position) {
        if (root == null) {
            throw new IllegalArgumentException("cannot process null binary trees");
        }
        if (position < 0) {
            throw new IllegalArgumentException("cannot process negative positions, " + position);
        }
        List<TreeNode> result = new ArrayList<>();
        findInOrderTree(root, result);
        if (position >= result.size()) {
            throw new IllegalArgumentException("Min position is larger than tree size!");
        }
        return result.get(position - 1);
    }

    private void findInOrderTree(TreeNode root, List<TreeNode> result) {
        if (root == null) return;
        findInOrderTree(root.left, result);
        result.add(root);
        findInOrderTree(root.right, result);
    }
}
