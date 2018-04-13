package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

public class CombinationSumTest {
    CombinationSum fixture;

    @Before
    public void setUp() {
        fixture = new CombinationSum();
    }

    @Test
    public void combinationSum() throws Exception {
        int[] input = {9, 3, 8, 5, 2};
        int target = 8;
        assertEquals(Lists.newArrayList(Lists.newArrayList(3, 3, 2), Lists.newArrayList(3, 5), Lists.newArrayList(8),
                Lists.newArrayList(2, 2, 2, 2)), fixture.combinationSum(input, target));
    }

}
