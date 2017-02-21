/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class LCABTTest {
    private LCABT fixture;

    @Before
    public void setUp() {
        fixture = new LCABT();
    }

    @Test
    public void shouldFindLowestCommonAncestorBT() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        TreeNode actual = fixture.lca(root, new TreeNode(4), new TreeNode(5));
        assertEquals(2, actual.getVal());
    }

}
