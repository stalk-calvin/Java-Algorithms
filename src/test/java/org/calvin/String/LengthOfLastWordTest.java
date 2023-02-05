/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {
    LengthOfLastWord fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LengthOfLastWord();
    }

    @Test
    public void shouldFindLastwordLength() {
        assertEquals(3, fixture.lengthOfLastWord("he is a great man"));
    }
}
