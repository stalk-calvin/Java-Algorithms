/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by calvinlee on 2016-10-30.
 */
public class MoveZerosTest {
    MoveZeros fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new MoveZeros();
    }

    @Test
    public void testMoveZeroesToEnd() throws Exception {
        int[] input = {0,1,0,3,12};
        fixture.moveZeroes(input);
        int[] expected = {1,3,12,0,0};
        assertTrue(Arrays.equals(expected,input));
    }

}