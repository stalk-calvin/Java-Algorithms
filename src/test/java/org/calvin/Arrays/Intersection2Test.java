/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Intersection2Test {
    Intersection2 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Intersection2();
    }

    @Test
    public void testIntersection() throws Exception {
        int[] input1 = {1,2,2,1};
        int[] input2 = {2,2};

        int[] expected = {2,2};
        assertTrue(Arrays.equals(expected, fixture.intersect(input1, input2)));
    }

}