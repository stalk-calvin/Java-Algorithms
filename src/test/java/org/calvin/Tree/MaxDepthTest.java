/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthTest {
    MaxDepth fixture;

    @BeforeEach
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
