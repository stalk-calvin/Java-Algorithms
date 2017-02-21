/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class RotateTest {
    Rotate fixture;

    @Before
    public void setUp() {
        fixture = new Rotate();
    }

    @Test
    public void shouldRotateRight() {
        int[] input = {1,2,3,4,5};
        fixture.arrayRightRotation(input, 2);
        int[] expected = {4,5,1,2,3};
        assertTrue(Arrays.equals(expected,input));
    }

    @Test
    public void shouldRotateLeft() {
        int[] input = {1,2,3,4,5};
        fixture.arrayLeftRotation(input, input.length, 4);
        int[] expected = {5,1,2,3,4};
        assertTrue(Arrays.equals(expected,input));
    }
}
