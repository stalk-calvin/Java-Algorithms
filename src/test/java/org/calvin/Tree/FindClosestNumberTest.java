/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindClosestNumberTest {
    private FindClosestNumber fixture;

    @Before
    public void setUp() {
        fixture = new FindClosestNumber();
    }

    @Test
    public void shouldFindClosestNumber() {
        int[] input = {1,2,3,6,7,8,9,11,2};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        FindClosestNumber.Closest c = new FindClosestNumber.Closest();
        fixture.findClosest(root,c, 9);
        assertEquals(9, c.val);
    }
}
