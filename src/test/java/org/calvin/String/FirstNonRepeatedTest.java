/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstNonRepeatedTest {
    @Test
    public void shouldFindNonRepeated() throws Exception {
        String input = "tetfa";
        Character actual = FirstNonRepeated.findFirstNonRepeated(input);
        assertEquals('e', (char) actual);
    }

    @Test
    public void shouldNotFindRepeated() throws Exception {
        String input = "teetet";
        Character actual = FirstNonRepeated.findFirstNonRepeated(input);
        assertEquals(null, actual);
    }

    @Test
    public void shouldFindNonRepeatedMyWay() throws Exception {
        String input = "tetfa";
        Character actual = FirstNonRepeated.findFirstNonRepeatedMyWay(input);
        assertEquals('e', (char) actual);
    }

    @Test
    public void shouldNotFindRepeatedMyWay() throws Exception {
        String input = "teetet";
        Character actual = FirstNonRepeated.findFirstNonRepeatedMyWay(input);
        assertEquals(null, actual);
    }
}
