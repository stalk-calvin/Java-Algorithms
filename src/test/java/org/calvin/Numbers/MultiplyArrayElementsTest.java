/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplyArrayElementsTest {
    private MultiplyArrayElements fixture;

    private static final int[] input = {1,2,3,4,5};

    @BeforeEach
    public void setUp() {
        fixture = new MultiplyArrayElements();
    }

    @Test
    public void shouldMultiplyBruteForce() {
        int[] expected = {120,60,40,30,24};
        int[] result = fixture.multiplyBruteForce(input);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void shouldNotMultiplyBruteForce() {
        int[] expected = {};
        int[] result = fixture.multiplyBruteForce(new int[0]);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void shouldNotMultiplyNullArrayBruteForce() {
        int[] expected = {};
        int[] result = fixture.multiplyBruteForce(null);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void shouldMultiplyMoreEfficient() {
        int[] expected = {120,60,40,30,24};
        int[] result = fixture.multiplyMoreEfficient(input);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void shouldNotMultiplyMoreEfficient() {
        int[] expected = {};
        int[] result = fixture.multiplyMoreEfficient(new int[0]);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void shouldNotMultiplyNullArrayMoreEfficient() {
        int[] expected = {};
        int[] result = fixture.multiplyMoreEfficient(null);
        assertTrue(Arrays.equals(expected, result));
    }
}