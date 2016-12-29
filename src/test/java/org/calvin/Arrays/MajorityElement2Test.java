package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MajorityElement2Test {
    private MajorityElement2 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new MajorityElement2();
    }

    @Test
    public void shouldFindMajorityElement() throws Exception {
        int[] input = {8,7,9,1,1,1,1,2,2,2,2};
        List<Integer> actual = fixture.majorityElement(input);
        assertEquals(Arrays.asList(1,2), actual);
    }
}