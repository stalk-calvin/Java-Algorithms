/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicationWithoutMultiplyTest {
    private MultiplicationWithoutMultiply fixture;

    @BeforeEach
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