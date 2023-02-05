/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {
    RansomNote fixture;

    @Test
    public void shouldSolve() {
        fixture = new RansomNote("give me one grand today night", "give one grand today");
        assertTrue(fixture.solve());
    }

    @Test
    public void shouldNotSolve() {
        fixture = new RansomNote("give me one grand today night", "ABC DEF GHI");
        assertFalse(fixture.solve());
    }

    @Test
    public void shouldSolveRepeated() {
        fixture = new RansomNote("me me me me me", "me me me me");
        assertTrue(fixture.solve());
    }

    @Test
    public void shouldNotSolveRepeated() {
        fixture = new RansomNote("me me me me", "me me me me me");
        assertFalse(fixture.solve());
    }
}
