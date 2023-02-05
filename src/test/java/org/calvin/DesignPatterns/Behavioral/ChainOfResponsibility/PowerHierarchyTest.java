/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ChainOfResponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PowerHierarchyTest {
    private PurchasePower fixture;
    private PurchaseRequest purchaseRequest;

    @Mock private PrintStream ps;

    @BeforeEach
    public void setUp() {
        System.setOut(ps);
        purchaseRequest = new PurchaseRequest(5000);
        // President -> Vice President -> Manager
        fixture = new ManagerPPower();
        PurchasePower p = new PresidentPPower();
        PurchasePower vp = new VicePresidentPPower();
        PurchasePower d = new DirectorPPower();

        vp.setReportTo(p);
        d.setReportTo(vp);
        fixture.setReportTo(d);
    }

    @Test
    public void shouldGetAllowable() {
        assertEquals(((double)5000), fixture.getAllowable(), 0);
    }

    @Test
    public void shouldGetACorrectRole() {
        assertEquals("Manager", fixture.getRole());
    }

    @Test
    public void shouldDirectorApprove() {
        fixture.processRequest(purchaseRequest);
        verify(ps).println("Director will approve $5000.0");
    }

    @Test
    public void shouldVpApprove() {
        purchaseRequest.setAmount(10001);
        fixture.processRequest(purchaseRequest);
        verify(ps).println("Vice President will approve $10001.0");
    }

    @Test
    public void shouldPApprove() {
        purchaseRequest.setAmount(19999);
        fixture.processRequest(purchaseRequest);
        verify(ps).println("President will approve $19999.0");
    }

    @Test
    public void shouldUnableToApprove() {
        purchaseRequest.setAmount(50001);
        fixture.processRequest(purchaseRequest);
        verify(ps).println("President unable to approve $50001.0");
    }
}
