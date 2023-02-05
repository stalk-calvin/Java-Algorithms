/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UglyNumberTest {
    UglyNumber fixture;

    @BeforeEach
    public void setUp() {
        fixture = new UglyNumber();
    }

    @Test
    public void shouldBeUgly() {
        assertTrue(fixture.isUgly(10));
    }

    @Test
    public void shouldOneBeUgly() {
        assertTrue(fixture.isUgly(1));
    }

    @Test
    public void shouldNotBeUgly() {
        assertFalse(fixture.isUgly(21));
    }

    @Test
    public void shouldNegativeNotBeUgly() {
        assertFalse(fixture.isUgly(-1));
    }
}
