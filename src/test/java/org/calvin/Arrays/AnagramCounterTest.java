/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramCounterTest {
    AnagramCounter fixture;

    @BeforeEach
    public void setUp() {
        fixture = new AnagramCounter();
    }

    @Test
    public void shouldReturnNumberOfChangesNeeded() {
        int expected = 4;
        int actual = fixture.numberNeeded("cde", "abc");
        assertEquals(expected, actual);
    }
}
