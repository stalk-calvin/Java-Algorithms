/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindDuplicateTest {
    private FindDuplicate fixture;

    @BeforeEach
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

    @Test
    public void shouldFindDuplicateLeftSort() throws Exception {
        int[] input = {1,8,2,3,5,1};
        boolean actual = fixture.findDuplicateSort(input);
        assertTrue(actual);
    }

    @Test
    public void shouldFindDuplicateRightSort() throws Exception {
        int[] input = {8,8,2,3,5,1};
        boolean actual = fixture.findDuplicateSort(input);
        assertTrue(actual);
    }

    @Test
    public void shouldNotFindDuplicateSort() throws Exception {
        assertFalse(fixture.findDuplicateSort(null));
    }
}
