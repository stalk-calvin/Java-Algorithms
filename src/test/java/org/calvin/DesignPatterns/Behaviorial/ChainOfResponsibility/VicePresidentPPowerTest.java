/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.ChainOfResponsibility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VicePresidentPPowerTest {
    PurchasePower fixture;

    @Before
    public void setUp() {
        fixture = new VicePresidentPPower();
    }

    @Test
    public void shouldGetAllowable() {
        assertEquals(((double)20000), fixture.getAllowable(), 0);
    }

    @Test
    public void shouldGetACorrectRole() {
        assertEquals("Vice President", fixture.getRole());
    }

}
