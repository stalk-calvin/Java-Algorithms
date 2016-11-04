/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LengthOfLastWordTest {
    LengthOfLastWord fixture;

    @Before
    public void setUp() {
        fixture = new LengthOfLastWord();
    }

    @Test
    public void shouldFindLastwordLength() {
        assertEquals(3, fixture.lengthOfLastWord("he is a great man"));
    }

}