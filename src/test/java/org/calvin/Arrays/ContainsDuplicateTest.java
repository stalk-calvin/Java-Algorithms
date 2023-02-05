/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    ContainsDuplicate fixture;

    @BeforeEach
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
        assertTrue(fixture.containsDuplicateUsingSort(input));
    }

    @Test
    public void shouldContainsNoDuplicateSecondMethod() {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(fixture.containsDuplicateUsingSort(input));
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

    @Test
    public void shouldRemoveAdjacentDuplicate() {
        String s = "ccbaabddd";
        String actual = fixture.removeAdjacentDuplicates(s);
        assertEquals("d", actual);
    }
}
