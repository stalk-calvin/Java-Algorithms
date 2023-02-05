/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BullsAndCowsTest {
    BullsAndCows fixture;

    @BeforeEach
    public void setUp() {
        fixture = new BullsAndCows();
    }

    @Test
    public void shouldGiveCorrectAnswer() {
        assertEquals("0A0B",fixture.solve("12","18275"));
        assertEquals("2A1B",fixture.solve("12345","18275"));
        assertEquals("5A0B",fixture.solve("23456","23456"));
        assertEquals("0A0B",fixture.solve("11111","22222"));
        assertEquals("2A0B",fixture.solve("12345","12222"));
        assertEquals("1A4B",fixture.solve("12345","54321"));
    }
}
