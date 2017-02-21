/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrintPossibleCorrectParenthesesTest {
    private PrintPossibleCorrectParentheses fixture;

    @Before
    public void setUp() {
        fixture = new PrintPossibleCorrectParentheses();
    }

    @Test
    public void shouldPrintAllSimpleCombinations() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        fixture.printAllCombinations(1);
        verify(ps).println("()");
    }

    @Test
    public void shouldPrintAllComplicatedCombinations() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        fixture.printAllCombinations(3);
        verify(ps).println("((()))");
        verify(ps).println("(()())");
        verify(ps).println("(())()");
        verify(ps).println("()(())");
        verify(ps).println("()()()");
    }
}