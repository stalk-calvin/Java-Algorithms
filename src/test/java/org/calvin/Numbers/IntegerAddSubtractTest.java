/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerAddSubtractTest {
    IntegerAddSubtract fixture;

    @Before
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
