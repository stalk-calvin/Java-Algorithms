/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by calvinlee on 2016-10-30.
 */
public class MajorityElementTest {
    MajorityElement fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new MajorityElement();
    }

    @Test
    public void shouldBeMajorityElement() throws Exception {
        int[] input = {1,2,2,2,3};
        assertEquals(2, fixture.majorityElement(input));
    }

    @Test
    public void shouldNotBeMajorityElement() throws Exception {
        int[] input = {1,2,3,4,5};
        assertTrue(2 != fixture.majorityElement(input));
    }

}