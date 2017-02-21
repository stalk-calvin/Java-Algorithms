/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDepthTest {
    MaxDepth fixture;

    @Before
    public void setUp() {
        fixture = new MaxDepth();
    }

    @Test
    public void shouldFindMaxDepth() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        assertEquals(4, fixture.maxDepth(root));
    }

}
