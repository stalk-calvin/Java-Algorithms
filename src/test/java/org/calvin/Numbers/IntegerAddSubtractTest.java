/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerAddSubtractTest {
    IntegerAddSubtract fixture;

    @BeforeEach
    public void setUp() {
        fixture = new IntegerAddSubtract();
    }

    @Test
    public void shouldGetSum() {
        assertEquals(3, fixture.getSum(1,2));
    }

    @Test
    public void shouldGetSubtract() {
        assertEquals(1, fixture.getSubtract(3,2));
    }

}
