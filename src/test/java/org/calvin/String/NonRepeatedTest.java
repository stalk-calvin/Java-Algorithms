package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonRepeatedTest {
    @Test
    public void shouldFindNonRepeated() throws Exception {
        String input = "teeter";
        Character actual = NonRepeated.findNonRepeated(input);
        assertEquals('r', (char) actual);
    }

    @Test
    public void shouldNotFindRepeated() throws Exception {
        String input = "teetet";
        Character actual = NonRepeated.findNonRepeated(input);
        assertEquals(null, actual);
    }
}