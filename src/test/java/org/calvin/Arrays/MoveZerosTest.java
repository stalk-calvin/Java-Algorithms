/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class MoveZerosTest {
    MoveZeros fixture;

    @Before
    public void setUp() {
        fixture = new MoveZeros();
    }

    @Test
    public void shouldMoveZeroesToEnd() {
        int[] input = {0,1,0,3,12};
        fixture.moveZeroes(input);
        int[] expected = {1,3,12,0,0};
        assertTrue(Arrays.equals(expected,input));
    }

    @Test
    public void shouldNotMove() {
        int[] input = null;
        fixture.moveZeroes(input);
        int[] expected = null;
        assertTrue(Arrays.equals(expected,input));
    }
}