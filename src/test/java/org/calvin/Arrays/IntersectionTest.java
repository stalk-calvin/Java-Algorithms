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
    public void setUp() {
        fixture = new Intersection();
    }

    @Test
    public void shouldReturnCorrectIntersection() {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {6, 7, 3, 3, 3};
        int[] expected = {3};
        assertTrue(Arrays.equals(expected, fixture.intersection(input1, input2)));
    }

    @Test
    public void shouldReturnNoIntersection() {
        int[] input1 = null;
        int[] input2 = {6, 7, 3, 3, 3};
        int[] expected = new int[0];
        assertTrue(Arrays.equals(expected, fixture.intersection(input1, input2)));
    }
}