package org.calvin.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionMultipleTest {
    @Test
    public void shouldHaveIntersection() {
        int[] input1 = {1,2,2,1};
        int[] input2 = {2,2};

        int[] expected = {2,2};
        assertArrayEquals(expected, IntersectionMultiple.intersectMultiple(input1, input2));
    }

    @Test
    public void shouldHaveNoIntersection() {
        int[] input1 = {1,2,2,1};
        int[] input2 = {3,3};

        int[] expected = new int[0];
        assertArrayEquals(expected, IntersectionMultiple.intersectMultiple(input1, input2));
    }

    @Test
    public void shouldHaveEmptyArray() {
        int[] input1 = null;
        int[] input2 = {3,3};

        int[] expected = new int[0];
        assertArrayEquals(expected, IntersectionMultiple.intersectMultiple(input1, input2));
    }
}