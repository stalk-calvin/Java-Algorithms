package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumTest {
    private CombinationSum fixture;

    @Before
    public void setUp() {
        fixture = new CombinationSum();
    }

    @Test
    public void combinationSum() throws Exception {
        int[] input = {2,3,6,7,8,12};
        assertEquals(Lists.newArrayList(Lists.newArrayList(2,2,3), Lists.newArrayList(7)), fixture.combinationSum(input, 7));
    }

}