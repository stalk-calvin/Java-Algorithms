/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCABSTTest {
    LCABST fixture;

    @Before
    public void setUp() {
        fixture = new LCABST();
    }

    @Test
    public void shouldFindLowestCommonAncestor() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(root.left, fixture.lowestCommonAncestor(root, root.left.left, root.left.right.right));
    }

}