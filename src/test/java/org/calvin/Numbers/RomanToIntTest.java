/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntTest {
    RomanToInt fixture;

    @BeforeEach
    public void setUp() {
        fixture = new RomanToInt();
    }

    @Test
    public void shouldGiveSimpleRomanToInt() {
        assertEquals(14, fixture.romanToInt("XIV"));
    }

    @Test
    public void shouldGiveComplexRomanToInt() {
        assertEquals(2484, fixture.romanToInt("MDCMLXXXIV"));
    }
}
