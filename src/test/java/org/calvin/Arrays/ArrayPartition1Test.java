package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayPartition1Test {
    private ArrayPartition1 fixture;

    @Before
    public void setUp() {
        fixture = new ArrayPartition1();
    }

    @Test
    public void shouldFindLargestSumOfMinPairs() {
        int[] input = {1,2,3,4,5,6};
        assertEquals(9, fixture.arrayPairSum(input));
    }
}