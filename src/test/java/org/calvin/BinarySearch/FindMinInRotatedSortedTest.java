package org.calvin.BinarySearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FindMinInRotatedSortedTest {
    private FindMinInRotatedSorted fixture;

    @Before
    public void setUp() {
        fixture = new FindMinInRotatedSorted();
    }

    @Test
    public void shouldFindMin() {
        int[] input = {4, 5, 6, 7, 0, 1, 2};
        int actual = fixture.findMin(input);
        assertEquals(0, actual);
    }

    @Test
    public void shouldFindMinWithNull() {
        int actual = fixture.findMin(null);
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void shouldFindMinWithOneItem() {
        int[] input = {4};
        int actual = fixture.findMin(input);
        assertEquals(4, actual);
    }


    @Test
    public void shouldFindMinWithDuplicate() {
        int[] input = {2, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 1, 2, 2};
        int actual = fixture.findMinWithDuplicated(input);
        assertEquals(1, actual);
    }

    @Test
    public void shouldNotFindMinWithDuplicate() {
        int[] input = {2, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 1, 2, 2};
        int actual = fixture.findMin(input);
        assertNotEquals(1, actual);
    }
}