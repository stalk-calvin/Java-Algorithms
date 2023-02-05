/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MajorityElement2Test {
    private MajorityElement2 fixture;

    @BeforeEach
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
