package org.calvin.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NonDecreasingArraySingleModificationTest {
    @Test
    public void shouldBeAbleToSortSingleValue() {
        int[] input = new int[]{15};
        assertTrue(NonDecreasingArraySingleModification.canSortWithOneChange(input));
    }

    @Test
    public void shouldBeAbleToSortWithOneChange() {
        int[] input = new int[]{1,3,7,3};
        assertTrue(NonDecreasingArraySingleModification.canSortWithOneChange(input));
    }

    @Test
    public void shouldBeAbleToSortWithOneBigValue() {
        int[] input = new int[]{1,8,3};
        assertTrue(NonDecreasingArraySingleModification.canSortWithOneChange(input));
    }

    @Test
    public void shouldBeAbleToSortWithStartingBigValue() {
        int[] input = new int[]{13,4,7};
        assertTrue(NonDecreasingArraySingleModification.canSortWithOneChange(input));
    }

    @Test
    public void shouldBeNotAbleToSortDecreasing() {
        int[] input = new int[]{13,4,1};
        assertFalse(NonDecreasingArraySingleModification.canSortWithOneChange(input));
    }
}