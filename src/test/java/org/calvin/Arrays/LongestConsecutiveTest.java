/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveTest {
    LongestConsecutive fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LongestConsecutive();
    }

    @Test
    public void shouldFindCorrectConsecutives() {
        int[] input = {96, 100, 4, 200, 0, 1, 97, 3, 2, 101, 95, 98, 102, 99, 103};
        int[] expected = {95, 96, 97, 98, 99, 100, 101, 102, 103};
        assertEquals(expected.length, fixture.longestConsecutive(input));
    }

}
