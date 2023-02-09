package org.calvin.DesignPatterns.Structural.CohesionCoupling.lowtight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailLowTightTest {
    private EmailLowTight fixture;
    @BeforeEach
    void setUp() {
        fixture = new EmailLowTight();
    }

    @Test
    public void shouldCheckSendPrintEmail() {
        Assertions.assertTrue(fixture.check());
        Assertions.assertTrue(fixture.send());
        Assertions.assertTrue(fixture.print());
    }
}