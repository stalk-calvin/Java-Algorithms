package org.calvin.Numbers;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumOfEvenNumbersTest {
    private SumOfEvenNumbers fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new SumOfEvenNumbers();
    }

    @Test
    public void sumEvenAfterQueries() {
        int[] input = {1,2,3,4};
        int[][] queries = new int[input.length][2];
        queries[0] = new int[]{1, 0};
        queries[1] = new int[]{-3, 1};
        queries[2] = new int[]{-4, 0};
        queries[3] = new int[]{2, 3};
        List<Integer> actual = fixture.sumEvenAfterQueries(input, queries);
        List<Integer> expected = Arrays.asList(8, 6, 2, 4);
        assertEquals(expected, actual);
    }
}