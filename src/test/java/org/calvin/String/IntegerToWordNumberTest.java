/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IntegerToWordNumberTest {
    private IntegerToWordNumber fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new IntegerToWordNumber();
    }

    @Test
    public void numberToWords() throws Exception {
        int input = 1231234567;
        String actual = fixture.numberToWords(input);
        String expected = "One Billion Two Hundred Thirty One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        assertEquals(expected, actual);
    }
}
