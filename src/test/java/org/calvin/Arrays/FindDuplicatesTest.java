package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindDuplicatesTest {
    private FindDuplicates fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FindDuplicates();
    }

    @Test
    public void shouldFindDuplicateLeft() throws Exception {
        int[] input = {1,8,2,3,5,1};
        int actual = fixture.findDuplicate(input);
        assertEquals(1, input[actual]);
    }

    @Test
    public void shouldFindDuplicateRight() throws Exception {
        int[] input = {8,8,2,3,5,1};
        int actual = fixture.findDuplicate(input);
        assertEquals(8, input[actual]);
    }

    @Test
    public void shouldNotFindDuplicate() throws Exception {
        int actual = fixture.findDuplicate(null);
        assertEquals(0, actual);
    }
}