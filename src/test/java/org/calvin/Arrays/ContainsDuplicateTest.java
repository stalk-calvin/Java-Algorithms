/*
 * Copyright Calvin Lee - 2016.
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
}