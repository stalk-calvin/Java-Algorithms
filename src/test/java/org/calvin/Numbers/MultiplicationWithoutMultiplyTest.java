/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationWithoutMultiplyTest {
    private MultiplicationWithoutMultiply fixture;

    @Before
    public void setUp() {
        fixture = new MultiplicationWithoutMultiply();

    }

    @Test
    public void shouldMultiply() {
        int actual = fixture.multiply(2,3);
        assertEquals(6, actual);
    }

    @Test
    public void shouldMultiplyNegativeLeft() {
        int actual = fixture.multiply(-2,3);
        assertEquals(-6, actual);
    }

    @Test
    public void shouldMultiplyNegativeRight() {
        int actual = fixture.multiply(2,-3);
        assertEquals(-6, actual);
    }

    @Test
    public void shouldMultiplyBothNegative() {
        int actual = fixture.multiply(-2,-3);
        assertEquals(6, actual);
    }
}