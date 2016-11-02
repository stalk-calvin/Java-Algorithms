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
    public void setUp() {
        fixture = new Intersection2();
    }

    @Test
    public void shouldHaveIntersection() {
        int[] input1 = {1,2,2,1};
        int[] input2 = {2,2};

        int[] expected = {2,2};
        assertTrue(Arrays.equals(expected, fixture.intersect(input1, input2)));
    }

    @Test
    public void shouldHaveNoIntersection() {
        int[] input1 = {1,2,2,1};
        int[] input2 = {3,3};

        int[] expected = new int[0];
        assertTrue(Arrays.equals(expected, fixture.intersect(input1, input2)));
    }

    @Test
    public void shouldHaveEmptyArray() {
        int[] input1 = null;
        int[] input2 = {3,3};

        int[] expected = new int[0];
        assertTrue(Arrays.equals(expected, fixture.intersect(input1, input2)));
    }
}