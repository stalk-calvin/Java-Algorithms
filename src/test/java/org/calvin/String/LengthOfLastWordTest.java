/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
