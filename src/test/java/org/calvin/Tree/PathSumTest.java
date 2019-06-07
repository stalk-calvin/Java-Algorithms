/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class PathSumTest {
    PathSum fixture;

    @Before
    public void setUp() {
        fixture = new PathSum();
    }

    @Test
    public void shouldHavePathSum() {
        int[] input = {1,2,3,4,5,6,7};
        TreeNode root = AssortedMethods.createTreeFromArray(input);

        assertTrue(fixture.hasPathSum(root,10));
    }

    @Test
    public void shouldCalculatePathSum() {
        int[] input = {1,1,1,2,2,2,2};
        TreeNode root = AssortedMethods.createTreeFromArray(input);

        assertEquals(4, fixture.calculate_path_sum(root,4, 0));
    }
}
