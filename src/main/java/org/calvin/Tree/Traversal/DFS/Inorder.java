/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree.Traversal.DFS;

import org.calvin.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public List<Integer> findInorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        return findInorder(root, result);
    }

    private List<Integer> findInorder(TreeNode root, List<Integer> result) {
        if (root == null) return result;
        findInorder(root.getLeft(), result);
        result.add(root.getVal());
        findInorder(root.getRight(), result);
        return result;
    }
}
