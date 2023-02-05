/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestNumberTest {
    private LargestNumber fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new LargestNumber();
    }

    @Test
    public void shouldFindLargestNumber() throws Exception {
        int[] input = {3, 30, 34, 5, 9};
        String actual = fixture.largestNumber(input);
        assertEquals("9534330", actual);
    }

    @Test
    public void shouldGiveEmptyOnNull() throws Exception {
        String actual = fixture.largestNumber(null);
        assertEquals("", actual);
    }

    @Test
    public void shouldPassNegatives() throws Exception {
        int[] input = {-2, -3, -4, -1};
        String actual = fixture.largestNumber(input);
        assertEquals("0", actual);
    }
}
