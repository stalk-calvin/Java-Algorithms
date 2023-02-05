/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerToStringTest {
    private IntegerToString fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new IntegerToString();
    }

    @Test
    public void numberToWords() throws Exception {
        int input = 1231234567;
        String actual = fixture.numberToWords(input);
        String expected = "One Billion Two Hundred Thirty One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        assertEquals(expected, actual);
    }
}
