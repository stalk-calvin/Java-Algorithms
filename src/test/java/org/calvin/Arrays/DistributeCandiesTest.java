/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DistributeCandiesTest {
    private DistributeCandies fixture;

    @Before
    public void setUp() {
        fixture = new DistributeCandies();
    }

    @Test public void shouldFailFindMaximalDistributionWithOddNumber() throws Exception {
        int[] input = {1,1,2,2,3};
        assertEquals(-1, fixture.distributeCandies(input));
    }

    @Test public void shouldFindMaximalDistributionWithManyKinds() throws Exception {
        int[] input = {1,1,2,2,3,3};
        assertEquals(3, fixture.distributeCandies(input));
    }

    @Test public void shouldFindMaximalDistributionWithFewKinds() throws Exception {
        int[] input = {1,1,2,3};
        assertEquals(2, fixture.distributeCandies(input));
    }

}
