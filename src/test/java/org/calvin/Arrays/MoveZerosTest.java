/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoveZerosTest {
    MoveZeros fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MoveZeros();
    }

    @Test
    public void shouldMoveZeroesToEnd() {
        int[] input = {0,1,0,3,0};
        int length = fixture.moveAndReturnNumberOfNonZeroes(input);
        int[] expected = {1,3};
        assertTrue(Arrays.equals(expected, Arrays.copyOfRange(input, 0, length)));
    }

    @Test
    public void shouldMoveZeroesToEndMethod2() {
        int[] input = {0,1,0,3,0};
        int length = fixture.moveZeros(input);
        int[] expected = {1,3};
        assertTrue(Arrays.equals(expected, Arrays.copyOfRange(input, 0, length)));
    }
}
