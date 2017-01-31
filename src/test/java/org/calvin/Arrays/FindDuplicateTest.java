package org.calvin.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FindDuplicateTest {
    private FindDuplicate fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FindDuplicate();
    }

    @Test
    public void shouldFindDuplicateLeft() throws Exception {
        int[] input = {1,8,2,3,5,1};
        boolean actual = fixture.findDuplicate(input);
        assertTrue(actual);
    }

    @Test
    public void shouldFindDuplicateRight() throws Exception {
        int[] input = {8,8,2,3,5,1};
        boolean actual = fixture.findDuplicate(input);
        assertTrue(actual);
    }

    @Test
    public void shouldNotFindDuplicate() throws Exception {
        assertFalse(fixture.findDuplicate(null));
    }
}