/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class FindClosestNumberTest {
    private FindClosestNumber fixture;

    @Before
    public void setup() {
        fixture = new FindClosestNumber();
    }

    @Test
    public void shouldFindClosestNumber() {
        int[] input = {1,2,3,6,7,8,9,11,2};
        TreeNode root = AssortedMethods.createTreeFromArray(input);

        int actual = fixture.findClosest(root,4);
        assertEquals(3, actual);
    }
}
