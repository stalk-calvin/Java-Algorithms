/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinMoveTest {
    MinMove fixture;

    @Before
    public void setUp() {
        fixture = new MinMove();
    }

    @Test
    public void shouldCalculateMinMove() {
        assertEquals(5, fixture.minMove("aaabbccaaa","abbca"));
    }

}
