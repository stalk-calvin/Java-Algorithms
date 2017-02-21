/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicate fixture;

    @Before
    public void setUp() {
        fixture = new ContainsDuplicate();
    }

    @Test
    public void shouldContainsDuplicateFirstMethod() {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertTrue(fixture.containsDuplicateFirst(input));
    }

    @Test
    public void shouldContainsNoDuplicateFirstMethod() {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(fixture.containsDuplicateFirst(input));
    }

    @Test
    public void shouldContainsDuplicateSecondMethod() {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertTrue(fixture.containsDuplicateSecond(input));
    }

    @Test
    public void shouldContainsNoDuplicateSecondMethod() {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(fixture.containsDuplicateSecond(input));
    }

    @Test
    public void shouldContainsNearbyDuplicate() {
        int[] input = {1 ,2, 3, 4, 8, 6, 7, 8, 9, 1};
        assertTrue(fixture.containsNearbyDuplicate(input, 3));
    }

    @Test
    public void shouldNotContainsNearbyDuplicate() {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertFalse(fixture.containsNearbyDuplicate(input, 3));
    }

    @Test
    public void shouldContainNearbyAlmostDuplicate() {
        int[] input = {1,12,23,44,85,6,7,6,8,5,4,3,2,1};
        boolean actual = fixture.containsNearbyAlmostDuplicate(input,3,3);
        assertTrue(actual);
    }

    @Test
    public void shouldContainNearbyAlmostDuplicateOverflow() {
        int[] input = {-2147483648,-2147483647};
        boolean actual = fixture.containsNearbyAlmostDuplicate(input,3,3);
        assertTrue(actual);
    }

    @Test
    public void shouldNotContainNearbyAlmostDuplicate() {
        int[] input = {1,5,9,14,18,5,1,14};
        boolean actual = fixture.containsNearbyAlmostDuplicate(input,3,3);
        assertFalse(actual);
    }

    @Test
    public void shouldNotContainNearbyAlmostDuplicateOneItem() {
        int[] input = {1};
        boolean actual = fixture.containsNearbyAlmostDuplicate(input,3,3);
        assertFalse(actual);
    }
}
