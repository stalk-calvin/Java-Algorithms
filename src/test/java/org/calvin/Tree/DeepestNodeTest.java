package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeepestNodeTest {

    @Test
    public void findDeepestNode() {
        int[] input = {1,2,3,4,5,6,7};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        TreeNode expected = new TreeNode(8);
        root.right.left.left = expected;

        assertEquals(expected, DeepestNode.findDeepestNode(root));
    }
}