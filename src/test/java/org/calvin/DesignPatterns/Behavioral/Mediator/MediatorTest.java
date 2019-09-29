/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Mediator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MediatorTest {
    private Mediator fixture;

    @Mock
    private PrintStream ps;

    @Before
    public void setUp() {
        System.setOut(ps);
        fixture = new Mediator(new AEventHandler(), new BEventHandler(), new CEventHandler());
    }
    @Test
    public void shouldBroadcastEventToBC() {
        fixture.sendEvent("A", "send mail");
        verify(ps).println(startsWith("B"));
        verify(ps).println(startsWith("C"));
    }

    @Test
    public void shouldBroadcastEventToAC() {
        fixture.sendEvent("B", "send mail");
        verify(ps).println(startsWith("A"));
        verify(ps).println(startsWith("C"));
    }

    @Test
    public void shouldBroadcastEventToAB() {
        fixture.sendEvent("C", "send mail");
        verify(ps).println(startsWith("B"));
        verify(ps).println(startsWith("A"));
    }

}
