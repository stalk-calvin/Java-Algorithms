package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicate fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new ContainsDuplicate();
    }

    @Test
    public void testContainsDuplicateFirstMethod() throws Exception {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertTrue(fixture.containsDuplicateFirst(input));
    }

    @Test
    public void testContainsNoDuplicateFirstMethod() throws Exception {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertTrue(fixture.containsDuplicateFirst(input));
    }

    @Test
    public void testContainsDuplicateSecondMethod() throws Exception {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(fixture.containsDuplicateSecond(input));
    }

    @Test
    public void testContainsNoDuplicateSecondMethod() throws Exception {
        int[] input = {1 ,2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(fixture.containsDuplicateSecond(input));
    }
}