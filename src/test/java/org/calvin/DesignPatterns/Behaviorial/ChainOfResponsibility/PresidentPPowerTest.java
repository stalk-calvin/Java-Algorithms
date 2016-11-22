/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.ChainOfResponsibility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PresidentPPowerTest {
    PurchasePower fixture;

    @Before
    public void setUp() {
        fixture = new PresidentPPower();
    }

    @Test
    public void shouldGetAllowable() {
        assertEquals(((double)30000), fixture.getAllowable(), 0);
    }

    @Test
    public void shouldGetACorrectRole() {
        assertEquals("President", fixture.getRole());
    }

}