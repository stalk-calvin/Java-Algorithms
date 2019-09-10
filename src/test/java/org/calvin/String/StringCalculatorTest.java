package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldAddEmptyToZero() {
        assertEquals(0, StringCalculator.Add(""));
    }

    @Test
    public void shouldAddSingleDigit() {
        assertEquals(1, StringCalculator.Add("1"));
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(3, StringCalculator.Add("1,2"));
    }

    @Test
    public void shouldAddMultipleNumbers() {
        assertEquals(1443, StringCalculator.Add("1,2,1231,52,155,2"));
    }

    @Test
    public void shouldHandleNewLine() {
        assertEquals(1443, StringCalculator.Add("1,2\n1231,52,155,2"));
    }

    @Test
    public void shouldHandleInvalid() {
        assertEquals(0, StringCalculator.Add("1,\n1231,52,155,2"));
    }
}