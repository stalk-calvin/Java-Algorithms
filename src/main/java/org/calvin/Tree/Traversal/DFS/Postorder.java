/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree.Traversal.DFS;

import org.calvin.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    public List<Integer> findPostorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        return findPostorder(root, result);
    }

    private List<Integer> findPostorder(TreeNode root, List<Integer> result) {
        if (root == null) return result;
        findPostorder(root.getLeft(), result);
        findPostorder(root.getRight(), result);
        result.add(root.getVal());
        return result;
    }
}
