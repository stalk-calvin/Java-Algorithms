/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PrintPossibleCorrectParenthesesTest {
    private PrintPossibleCorrectParentheses fixture;

    @BeforeEach
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

    @Test
    public void shouldGatherAllParenthesis() {
        List<String> actual = fixture.gatherAllParenthesis(3);
        List<String> expected = Lists.newArrayList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, actual);
    }
}
