/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LookAndSayTest {
    private LookAndSay fixture;

    @Before
    public void setUp() {
        fixture = new LookAndSay();
    }

    @Test
    public void shouldLookAndSay() {
        String actual = fixture.lookAndSay("1213222213211");
        assertEquals("111211134211131221", actual);
    }

    @Test
    public void shouldFirstTenResultMatch() {
        String[] expected = {
                "1",
                "11",
                "21",
                "1211",
                "111221",
                "312211",
                "13112221",
                "1113213211",
                "31131211131221",
                "13211311123113112211"
        };

        for (int i = 0; i < expected.length-1; i++) {
            String input = expected[i];
            String actual = fixture.lookAndSay(input);
            assertEquals(expected[i+1], actual);
        }
    }

}
