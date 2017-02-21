/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindMinimumNumberInRotatedArrayTest {
    private FindMinimumNumberInRotatedArray fixture;

    @Before
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
