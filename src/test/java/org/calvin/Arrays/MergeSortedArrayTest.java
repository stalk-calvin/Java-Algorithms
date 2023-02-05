/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortedArrayTest {
    MergeSortedArray fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MergeSortedArray();
    }

    @Test
    public void shouldMergeTwoSortedArray() {
        int[] input1 = {2,4,6,0,0,0};
        int[] input2 = {1,3,5};
        fixture.merge(input1, 3, input2, 3);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertTrue(Arrays.equals(expected, input1));
    }

}
