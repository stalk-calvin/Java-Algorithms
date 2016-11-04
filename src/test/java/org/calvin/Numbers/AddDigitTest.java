/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddDigitTest {
    AddDigit fixture;

    @Before
    public void setUp() {
        fixture = new AddDigit();
    }

    @Test
    public void addDigits() {
        assertEquals(9, fixture.addDigits(18));
    }

}