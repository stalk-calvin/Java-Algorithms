/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree.Traversal.DFS;

import org.calvin.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public List<Integer> findPreorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        return findPreorder(root, result);
    }

    private List<Integer> findPreorder(TreeNode root, List<Integer> result) {
        if (root == null) return result;
        result.add(root.getVal());
        findPreorder(root.getLeft(), result);
        findPreorder(root.getRight(), result);
        return result;
    }
}
