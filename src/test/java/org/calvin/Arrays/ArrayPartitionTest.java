package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPartitionTest {
    private ArrayPartition fixture;

    @Before
    public void setUp() {
        fixture = new ArrayPartition();
    }

    @Test
    public void shouldFindLargestSumOfMinPairs() {
        int[] input = {3,2,1,6,5,4};
        assertEquals(9, fixture.arrayPairSum(input));
    }
}
