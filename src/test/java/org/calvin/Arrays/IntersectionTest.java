/*
 * Copyright Calvin Lee - 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class IntersectionTest {
    Intersection fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Intersection();
    }

    @Test
    public void shouldReturnCorrectIntersection() throws Exception {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {6, 7, 8, 9, 3};
        int[] expected = {3};
        assertTrue(Arrays.equals(expected, fixture.intersection(input1, input2)));
    }

}