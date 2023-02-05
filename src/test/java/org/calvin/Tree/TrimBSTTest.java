package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrimBSTTest {
    @Test
    public void trimBST() {
        int[] input = {3,0,4};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        assertNotNull(root);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        TreeNode actual = TrimBST.trimBST(root, 1, 3);
        assertEquals(root.val, 3);
        assertEquals(root.left.val, 2);
        assertEquals(root.left.left.val, 1);
    }
}