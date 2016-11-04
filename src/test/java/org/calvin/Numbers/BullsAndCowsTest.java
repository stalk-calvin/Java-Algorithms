/*
 * Copyright Calvin Lee - 2016.
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

}