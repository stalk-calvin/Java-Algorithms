/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CarTest {
    Car fixture;

    @Before
    public void setUp() {
        fixture = new Car();
    }

    @Test
    public void shouldAcceptPrintVisitor() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        CarElementPrintVisitor printVisitor = new CarElementPrintVisitor();
        fixture.accept(printVisitor);
        verify(ps).println(contains("front left"));
        verify(ps).println(contains("front right"));
        verify(ps).println(contains("back left"));
        verify(ps).println(contains("back right"));
        verify(ps).println(contains("engine"));
        verify(ps).println(contains("body"));
        verify(ps).println(contains("car"));
    }

    @Test
    public void shouldAcceptDoVisitor() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        CarElementDoVisitor doVisitor = new CarElementDoVisitor();
        fixture.accept(doVisitor);
        verify(ps, times(4)).println(startsWith("Kicking"));
        verify(ps, times(2)).println(startsWith("Starting"));
        verify(ps, times(1)).println(startsWith("Moving"));
    }

}
