/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindClosestNumberTest {
    private FindClosestNumber fixture;

    @BeforeEach
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
