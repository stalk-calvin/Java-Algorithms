/*
 * Copyright Calvin Lee - 2016.
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
    public void shouldRotate() {
        int[] input = {1,2,3,4,5};
        fixture.rotate(input, 2);
        int[] expected = {4,5,1,2,3};
        assertTrue(Arrays.equals(expected,input));
    }

}