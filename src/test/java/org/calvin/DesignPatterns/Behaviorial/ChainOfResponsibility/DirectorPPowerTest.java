/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.ChainOfResponsibility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DirectorPPowerTest {
    PurchasePower fixture;
    PurchaseRequest purchaseRequest;
    PurchasePower successor;

    @Mock
    PrintStream ps;

    @Before
    public void setUp() {
        System.setOut(ps);
        purchaseRequest = new PurchaseRequest(9999, "Bar");
        fixture = new DirectorPPower();
        fixture.setSuccessor(new PresidentPPower());
    }

    @Test
    public void shouldGetAllowable() {
        assertEquals(((double)10000), fixture.getAllowable(), 0);
    }

    @Test
    public void shouldGetACorrectRole() {
        assertEquals("Director", fixture.getRole());
    }

    @Test
    public void shouldProcessRequestDirector() {
        fixture.processRequest(purchaseRequest);
        verify(ps).println("Director will approve $9999.0");
    }

    @Test
    public void shouldProcessRequestSuccessor() {
        purchaseRequest.setAmount(10001);
        fixture.processRequest(purchaseRequest);
        verify(ps).println("President will approve $10001.0");
    }
}
