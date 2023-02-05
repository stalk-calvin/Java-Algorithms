package org.calvin.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddOneTest {
    @Test
    public void shouldAddOne() {
        int[] nums = new int[]{1,3,2,7};
        int[] actual = AddOne.addOne(nums);
        int[] expected = new int[]{1,3,2,8};
        assertArrayEquals(expected, actual);
        nums = new int[]{9,9,9};
        actual = AddOne.addOne(nums);
        expected = new int[]{1,0,0,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneNoPlus() {
        int[] nums = new int[]{1,3,2,7};
        int actual = AddOne.addOneNoArithmetic(nums);
        int expected = 1328;
        assertEquals(expected, actual);
        nums = new int[]{9,9,9};
        actual = AddOne.addOneNoArithmetic(nums);
        expected = 1000;
        assertEquals(expected, actual);
    }
}