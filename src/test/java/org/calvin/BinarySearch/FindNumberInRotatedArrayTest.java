/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindNumberInRotatedArrayTest {
    private FindNumberInRotatedArray fixture;

    @Before
    public void setUp() {
        fixture = new FindNumberInRotatedArray();
    }

    @Test
    public void shouldFindNumberInRotatedSortedArrayLeft() {
        int[] input = {1,2,3,4,5,6};
        int actual = fixture.find(input,1);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindNumberInRotatedSortedArrayRight() {
        int[] input = {5,1,2,3,4};
        int actual = fixture.find(input,4);
        assertEquals(4,actual);
    }

    @Test
    public void shouldFindNumberInRotatedSortedArrayWithDuplicatedElements() {
        int[] input = {5,5,1,1,1,1,2,2,3,4};
        int actual = fixture.find(input,5);
        assertEquals(5,actual);
    }

    @Test
    public void shouldNotFindElement() {
        int[] input = {5,5,1,1,1,1,2,2,3,4};
        int actual = fixture.find(input,7);
        assertEquals(-1,actual);
    }
}