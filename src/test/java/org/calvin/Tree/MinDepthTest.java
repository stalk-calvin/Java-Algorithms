/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinDepthTest {
    MinDepth fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MinDepth();
    }

    @Test
    public void shouldFindMinLevel() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        root.right.right = null;
        root.right.left = null;
        assertEquals(2, fixture.minDepth(root));
    }

    @Test
    public void shouldBeZeroMinLevelForNullTree() {
        assertEquals(0, fixture.minDepth(null));
    }
}
