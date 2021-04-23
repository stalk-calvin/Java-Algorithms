package org.calvin.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BoundSmallestWindowForSortedTest {

    @Test
    public void shouldFindRangeOfUnsorted() {
        int[] expected = new int[]{1,3};
        int[] actual = BoundSmallestWindowForSorted.rangeOfUnsorted(new int[]{3,7,5,6,9});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindRangeOfUnsortedAll() {
        int[] expected = new int[]{0,7};
        int[] actual = BoundSmallestWindowForSorted.rangeOfUnsorted(new int[]{9, 3, 2, 7, 5, 6, 4, 1});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindRangeOfSorted() {
        int[] expected = new int[]{-1,-1};
        int[] actual = BoundSmallestWindowForSorted.rangeOfUnsorted(new int[]{1,2,3,4,5,6,7});
        assertArrayEquals(expected, actual);
    }
}