/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringTest {
    private ReverseWordsInAString fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ReverseWordsInAString();
    }

    @Test
    public void shouldReverseWordsInAString() {
        String input = "the sky is blue";
        String actual = fixture.reverseWords(input);
        String expected = "blue is sky the";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseWordsInAStringWithMultipleSpaces() {
        String input = "the   sky    is     blue";
        String actual = fixture.reverseWords(input);
        String expected = "blue is sky the";
        assertEquals(expected, actual);
    }
}
