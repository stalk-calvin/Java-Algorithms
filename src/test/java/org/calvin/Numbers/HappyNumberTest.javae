/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HappyNumberTest {
    HappyNumber fixture;

    @Before
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