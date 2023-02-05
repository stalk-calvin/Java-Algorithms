/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {
    HappyNumber fixture;

    @BeforeEach
    public void setUp() {
        fixture = new HappyNumber();
    }

    @Test
    public void shouldBeHappy() {
        assertTrue(fixture.isHappy(10));
    }

    @Test
    public void shouldNotBeHappy() {
        assertFalse(fixture.isHappy(11));
    }

}
