/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {
    AddBinary fixture;

    @Before
    public void setUp() {
        fixture = new AddBinary();
    }

    @Test
    public void shouldAddBinary() {
        String actual = fixture.addBinary("011", "010");
        assertEquals("101", actual);
    }

    @Test
    public void shouldAddEmptyBinary() {
        String actual = fixture.addBinary("", "010");
        assertEquals("10", actual);
    }
}