/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeQueryImmutableTest {
    RangeQueryImmutable fixture;

    @Before
    public void setUp() {
        int[] input = {1,2,3,4,5,6,7,8,9};
        fixture = new RangeQueryImmutable(input);
    }

    @Test
    public void shouldCalculateSumRange() {
        assertEquals(9, fixture.sumRange(1,3));
    }

    @Test
    public void shouldCalculateSumRangeFromZeroMoreEfficiently() {
        assertEquals(10, fixture.sumRange(0,3));
    }


}