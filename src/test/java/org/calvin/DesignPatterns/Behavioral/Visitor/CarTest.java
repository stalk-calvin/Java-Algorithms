/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Visitor;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.*;

public class CarTest {
    private Car fixture;

    @Before
    public void setUp() {
        fixture = new Car();
    }

    @Test
    public void shouldAcceptPrintAndDoVisitor() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        CarElementVisitor printVisitor = new CarElementPrintVisitor();
        fixture.accept(printVisitor);
        //Wheels
        verify(ps).println(startsWith("Visiting front left"));
        verify(ps).println(startsWith("Visiting front right"));
        verify(ps).println(startsWith("Visiting back left"));
        verify(ps).println(startsWith("Visiting back right"));
        //Engine
        verify(ps).println(startsWith("Visiting engine"));
        //Body
        verify(ps).println(startsWith("Visiting body"));
        //Printing Car
        verify(ps).println(startsWith("Visiting car"));

        CarElementVisitor doVisitor = new CarElementDoVisitor();
        fixture.accept(doVisitor);
        //Wheels
        verify(ps, times(4)).println(startsWith("Kicking"));
        //Body
        verify(ps, times(1)).println(startsWith("Moving"));
        //Engine
        verify(ps, times(1)).println(startsWith("Vroom"));
        //Starting Car - Vroom
        verify(ps, times(1)).println(startsWith("Starting"));
    }

}
