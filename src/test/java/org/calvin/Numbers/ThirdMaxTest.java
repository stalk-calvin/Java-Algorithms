/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThirdMaxTest {
    private ThirdMax fixture;

    @Before public void setUp() throws Exception {
        fixture = new ThirdMax();
    }

    @Test public void shouldOutputThirdMaxFromThree() throws Exception {
        int[] input = {3,2,1};
        assertEquals(1, fixture.thirdMax(input));
    }

    @Test public void shouldOutputThirdMaxFromMoreThanThree() throws Exception {
        int[] input = {9,23,54,6,3,3,2,1,0};
        assertEquals(9, fixture.thirdMax(input));
    }

    @Test public void shouldOutputMaxFromLessThanThree() throws Exception {
        int[] input = {9,23};
        assertEquals(23, fixture.thirdMax(input));
    }
}
