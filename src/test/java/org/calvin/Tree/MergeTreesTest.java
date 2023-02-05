/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.jupiter.api.Assertions.*;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeTreesTest {
    MergeTrees fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MergeTrees();
    }

    @Test
    public void shouldMergeTwoTrees() {
        int[] expected = {2,4,6,8,5,6,7,8};
        TreeNode expectedTree = AssortedMethods.createTreeFromArray(expected);

        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input);
        input = new int[] {1,2,3,4};
        TreeNode t2 = AssortedMethods.createTreeFromArray(input);
        TreeNode actualTree = fixture.mergeTrees(t1,t2);

        assertEquals(expectedTree, actualTree);
    }

    @Test
    public void shouldMergeNullTrees() {
        TreeNode actualTree = fixture.mergeTrees(null,null);
        assertEquals(null, actualTree);
    }
}
