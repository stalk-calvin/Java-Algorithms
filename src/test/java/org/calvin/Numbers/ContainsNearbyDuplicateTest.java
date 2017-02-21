/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsNearbyDuplicateTest {
    ContainsNearbyDuplicate fixture;

    @Before
    public void setUp() {
        fixture = new ContainsNearbyDuplicate();
    }

    @Test
    public void shouldContainNearbyDuplicate() {
        int[] input = {1,2,3,2,5};
        assertTrue(fixture.containsNearbyDuplicate(input, 2));
    }

    @Test
    public void shouldNotContainNearbyDuplicate() {
        int[] input = {1,2,3,4,5};
        assertFalse(fixture.containsNearbyDuplicate(input, 2));
    }
}
