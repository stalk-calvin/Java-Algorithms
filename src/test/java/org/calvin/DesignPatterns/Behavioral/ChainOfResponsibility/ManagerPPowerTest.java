/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ChainOfResponsibility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ManagerPPowerTest {
    PurchasePower fixture;

    @Before
    public void setUp() {
        fixture = new ManagerPPower();
    }

    @Test
    public void shouldGetAllowable() {
        assertEquals(((double)5000), fixture.getAllowable(), 0);
    }

    @Test
    public void shouldGetACorrectRole() {
        assertEquals("Manager", fixture.getRole());
    }
}
