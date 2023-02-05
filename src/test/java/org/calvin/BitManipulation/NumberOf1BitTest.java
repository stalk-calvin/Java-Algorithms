/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitTest {
    NumberOf1Bit fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NumberOf1Bit();
    }

    @Test
    public void shouldCountBits() {
        int actual = fixture.hammingWeight(7);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
