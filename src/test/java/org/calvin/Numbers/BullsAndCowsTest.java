/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BullsAndCowsTest {
    BullsAndCows fixture;

    @Before
    public void setUp() {
        fixture = new BullsAndCows();
    }

    @Test
    public void shouldGiveCorrectAnswer() {
        assertEquals("2A1B",fixture. solve("12345","18275"));
    }

    @Test
    public void shouldGiveCorrectAnswerMyWay() {
        assertEquals("0A0B",fixture. solveMyWay("12","18275"));
        assertEquals("2A1B",fixture. solveMyWay("12345","18275"));
        assertEquals("5A0B",fixture. solveMyWay("23456","23456"));
        assertEquals("0A0B",fixture. solveMyWay("11111","22222"));
        assertEquals("2A0B",fixture. solveMyWay("12345","12222"));
        assertEquals("1A4B",fixture. solveMyWay("12345","54321"));
    }

}
