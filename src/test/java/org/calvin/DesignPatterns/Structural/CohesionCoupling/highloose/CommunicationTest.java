package org.calvin.DesignPatterns.Structural.CohesionCoupling.highloose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommunicationTest {
    private Communication fixture;

    @Test
    public void shouldCheckSendPrintEmail() {
        fixture =  new Email("aaa@bbb.com");
        Assertions.assertTrue(fixture.check());
        Assertions.assertTrue(fixture.send());
        assertEquals("Email{email='aaa@bbb.com'}", fixture.toString());
        Printer printer = new Printer(fixture);
        assertEquals("Email{email='aaa@bbb.com'}", printer.print());
    }

}