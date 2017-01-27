package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInAStringTest {
    private ReverseWordsInAString fixture;

    @Before
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