package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CombinationSumTest {
    private CombinationSum fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CombinationSum();
    }

    @Test
    public void combinationSum() throws Exception {
        int[] input = {2,3,6,7,8,12};
        assertEquals(Lists.newArrayList(Lists.newArrayList(2,2,3), Lists.newArrayList(7)), fixture.combinationSum(input, 7));
    }

}