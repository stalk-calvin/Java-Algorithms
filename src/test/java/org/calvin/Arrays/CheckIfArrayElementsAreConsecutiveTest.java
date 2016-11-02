package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckIfArrayElementsAreConsecutiveTest {
    CheckIfArrayElementsAreConsecutive fixture;

    @Before
    public void setup() {
        fixture = new CheckIfArrayElementsAreConsecutive();
    }

    @Test
    public void shouldNotBeConsecutive() {
        int input[] = {76, 78, 76, 77, 73, 74};
        assertFalse(fixture.areConsecutive(input));
    }

    @Test
    public void shouldBeConsecutive() {
        int input[] = {76, 78, 75, 77, 73, 74};
        assertTrue(fixture.areConsecutive(input));
    }

    @Test
    public void shouldQuitAfterLongDistance() {
        int input[] = {1, 78, 76, 77, 73, 74};
        assertFalse(fixture.areConsecutive(input));
    }
}