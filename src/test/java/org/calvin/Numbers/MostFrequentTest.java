/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MostFrequentTest {
    private MostFrequent fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new MostFrequent();
    }

    @Test
    public void shouldFindFrequentInteger() throws Exception {
        int[] input = {1,2,3,5,24,1,5,2,1,3,2,1,1,9,7,1};
        int actual = fixture.findFrequentInteger(input);
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindFrequentIntegerEfficiently() throws Exception {
        int[] input = {1,2,3,5,24,1,5,2,1,3,2,1,1,9,7,1};
        int actual = fixture.findFrequentEfficient(input);
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindKMostFrequentInteger() throws Exception {
        List<Integer> expected = Lists.newArrayList(1,2);
        int[] input = {1,2,3,5,24,1,5,2,1,3,2,1,1,9,7,1};
        List<Integer> actual = fixture.topKFrequent(input, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTopKFrequentUnderKSize() throws Exception {
        List<Integer> expected = Lists.newArrayList(3,4,2);
        int[] input = {4,3,2,3,3,4};
        List<Integer> actual = fixture.kTopStream(input, input.length, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTopKFrequentOverKSize() throws Exception {
        List<Integer> expected = Lists.newArrayList(3,4,2);
        int[] input = {4,3,2,3,3,4};
        List<Integer> actual = fixture.kTopStream(input, input.length, 15);
        assertEquals(expected, actual);
    }
}
