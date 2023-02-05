/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindMinimumNumberInRotatedArrayTest {
    private FindMinimumNumberInRotatedArray fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FindMinimumNumberInRotatedArray();
    }

    @Test
    public void shouldFindMin() {
        int[] input = {3,4,5,1,2};
        int actual = fixture.findMin(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindMinDuplicated() {
        int[] input = {3,3,4,5,5,1,2,2};
        int actual = fixture.findMin(input);
        assertEquals(1,actual);
    }

}
