/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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

}