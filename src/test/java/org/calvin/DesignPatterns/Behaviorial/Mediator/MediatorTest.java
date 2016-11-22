/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Mediator;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.Test;

public class MediatorTest {
    @Test(timeout = 10000)
    public void shouldProduceMessage() {
        Mediator fixture = new Mediator();

        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        new Producer(fixture).start();

        verify(ps, atLeast(1)).println(startsWith("p1"));
    }

    @Test(timeout = 10000)
    public void shouldProduceAndConsumeMessage() {
        Mediator fixture = new Mediator();

        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        new Producer(fixture).start();
        new Consumer(fixture).start();

        verify(ps, atLeast(1)).println(startsWith("p"));
        verify(ps, atLeast(1)).println(startsWith("c"));
    }
}