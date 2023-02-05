/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertTreeTest {
    InvertTree fixture;

    @BeforeEach
    public void setUp() {
        fixture = new InvertTree();
    }

    @Test
    public void shouldInvertTree() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.createTreeFromArray(input);

        int[] expected = {1,3,2,7,6,5,4};
        TreeNode expectedTree = AssortedMethods.createTreeFromArray(expected);
        expectedTree.right.right.right = new TreeNode(8);
        assertEquals(expectedTree, fixture.invertTree(root));
    }


}
