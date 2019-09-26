/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import com.google.common.collect.Lists;
import org.calvin.__Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void shouldCalculatePathSum() {
        int[] input = {1,1,1,2,2,2,2};
        TreeNode root = AssortedMethods.createTreeFromArray(input);

        assertEquals(4, fixture.calculate_path_sum(root,4, 0));
    }

    @Test
    public void shouldGatherPathSum() {
        int[] input = {5,4,8,11,13,4,7,2,1};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        List<String> expected = Lists.newArrayList("5->4->11->2", "5->4->13");

        assertEquals(expected, fixture.showPathSum(root,22));
    }
}
