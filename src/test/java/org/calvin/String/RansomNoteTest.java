/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RansomNoteTest {
    RansomNote fixture;

    @Test
    public void shouldSolve() {
        fixture = new RansomNote("give me one grand today night", "give one grand today");
        assertTrue(fixture.solve());
    }

}