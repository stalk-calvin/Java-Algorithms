/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMoveTest {
    MinMove fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MinMove();
    }

    @Test
    public void shouldCalculateMinMove() {
        assertEquals(5, fixture.minMove("aaabbccaaa","abbca"));
        assertEquals(2, fixture.minMove("abcdefg","abcdefggg"));
        assertEquals(1, fixture.minMove("abcdefg","abcdef"));
    }

    @Test
    public void shouldCalculateMinMoveEnglishOnly() {
        assertEquals(5, fixture.minMoveEnglishOnly("aaabbccaaa","abbca"));
        assertEquals(2, fixture.minMoveEnglishOnly("abcdefg","abcdefggg"));
        assertEquals(1, fixture.minMoveEnglishOnly("abcdefg","abcdef"));
    }
}
