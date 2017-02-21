/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.Lists;

public class SmallestNFromListTest {
    private SmallestNFromList fixture;

    @Before
    public void setUp() {
        fixture = new SmallestNFromList();
    }

    @Test
    public void shouldFindFiveSmallestUsingSort() {
        int[] input = {2,5,1,2,3,7,4,7,9,0};
        List<Integer> actual = fixture.findSmallestUsingSort(input, 5);
        List<Integer> expected = Lists.newArrayList(0,1,2,3,4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSmallestUsingSortUptoInputSize() {
        int[] input = {2,5,1,2,3,7,4,7,9,0};
        List<Integer> actual = fixture.findSmallestUsingSort(input, 100);
        List<Integer> expected = Lists.newArrayList(0,1,2,3,4,5,6,7,8,9);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFiveSmallestUsingHeap() {
        int[] input = {2,5,1,2,3,7,4,7,9,0};
        List<Integer> actual = fixture.findSmallestUsingHeap(input, 5);
        List<Integer> expected = Lists.newArrayList(0,1,2,3,4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSmallestUsingHeapUptoInputSize() {
        int[] input = {2,5,1,2,3,7,4,7,9,0};
        List<Integer> actual = fixture.findSmallestUsingHeap(input, 100);
        List<Integer> expected = Lists.newArrayList(0,1,2,3,4,5,6,7,8,9);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindSmallestUsingSort() {
        List<Integer> actual = fixture.findSmallestUsingSort(null, 100);
        assertEquals(Lists.newArrayList(), actual);
    }

    @Test
    public void shouldNotFindSmallestUsingHeap() {
        List<Integer> actual = fixture.findSmallestUsingHeap(null, 100);
        assertEquals(Lists.newArrayList(), actual);
    }

}
