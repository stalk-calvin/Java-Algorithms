/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfArrayElementsAreConsecutiveTest {
    CheckIfArrayElementsAreConsecutive fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CheckIfArrayElementsAreConsecutive();
    }

    @Test
    public void shouldNotBeConsecutive() {
        int input[] = {72, 78, 76, 77, 73, 74};
        assertFalse(fixture.areConsecutiveAndUnique(input));
    }

    @Test
    public void shouldNotBeConsecutiveContainsDuplicate() {
        int input[] = {76, 78, 76, 77, 73, 74};
        assertFalse(fixture.areConsecutiveAndUnique(input));
    }

    @Test
    public void shouldBeConsecutive() {
        int input[] = {76, 78, 75, 77, 73, 74};
        assertTrue(fixture.areConsecutiveAndUnique(input));
    }

    @Test
    public void shouldQuitAfterLongDistance() {
        int input[] = {1, 78, 76, 77, 73, 74};
        assertFalse(fixture.areConsecutiveAndUnique(input));
    }

    @Test
    public void shouldBeConsecutiveUsingSortMethod() {
        int[] input = {76, 78, 75, 77, 73, 74};
        assertTrue(fixture.areConsecutiveBySorting(input));
    }
}
