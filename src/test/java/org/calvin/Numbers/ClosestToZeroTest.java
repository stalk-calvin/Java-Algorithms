/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestToZeroTest {
    private ClosestToZero fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ClosestToZero();
    }

    @Test
    public void shouldFindClosestToZero() {
        int[] input = {1, -2, -8, 4, 5};
        int actual = fixture.closestToZero(input);
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindClosestToZeroAllNegative() {
        int[] input = {-12, -5, -137};
        int actual = fixture.closestToZero(input);
        assertEquals(-5, actual);
    }

    @Test
    public void shouldFindClosestToZeroValueOnRightSide() {
        int[] input = {42, -5, 12, 21, 5, 24};
        int actual = fixture.closestToZero(input);
        assertEquals(5, actual);
    }

    @Test
    public void shouldFindClosestToZeroValueOnLeftSide() {
        int[] input = {42, 5, 12, 21, -5, 24};
        int actual = fixture.closestToZero(input);
        assertEquals(5, actual);
    }

    @Test
    public void shouldFindClosestToZeroComplexExample() {
        int[] input = {-5, -4, -2, 12, -40, 4, 2, 18, 11, 5};
        int actual = fixture.closestToZero(input);
        assertEquals(2, actual);
    }

    @Test
    public void shouldFindNothing() {
        int actual = fixture.closestToZero(null);
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void shouldFindClosestToZeroNoExtra() {
        int[] input = {1, -2, -8, 4, 5};
        int actual = fixture.closestToZeroNoExtraSpace(input);
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindClosestToZeroAllNegativeNoExtra() {
        int[] input = {-12, -5, -137};
        int actual = fixture.closestToZeroNoExtraSpace(input);
        assertEquals(-5, actual);
    }

    @Test
    public void shouldFindClosestToZeroComplexExampleNoExtra() {
        int[] input = {-5, -4, -2, 12, -40, 4, 2, 18, 11, 5};
        int actual = fixture.closestToZeroNoExtraSpace(input);
        assertEquals(2, actual);
    }

    @Test
    public void shouldFindNothingNoExtra() {
        int actual = fixture.closestToZeroNoExtraSpace(null);
        assertEquals(Integer.MAX_VALUE, actual);
    }
}
