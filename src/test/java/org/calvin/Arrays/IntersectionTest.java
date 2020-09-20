/*
 * Copyright Calvin Lee Since 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionTest {
    Intersection fixture;

    @Before
    public void setUp() {
        fixture = new Intersection();
    }

    @Test
    public void shouldReturnCorrectIntersection() {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {6, 7, 3, 3, 3};
        int[] expected = {3};
        assertArrayEquals(expected, fixture.intersectionSet(input1, input2));
    }

    @Test
    public void shouldReturnNoIntersection() {
        int[] input2 = {6, 7, 3, 3, 3};
        int[] expected = new int[0];
        assertArrayEquals(expected, fixture.intersectionSet(null, input2));
    }
}
