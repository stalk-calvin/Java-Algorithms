package org.calvin.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstRecurringTest {
    @Test
    public void shouldFindFirstRecurring() throws Exception {
        String input = "teetet";
        Character actual = FirstRecurring.findFirstRecurring(input);
        assertEquals('t', (char) actual);
    }

    @Test
    public void shouldNotFindFirstRecurring() throws Exception {
        String input = "abcdef";
        Character actual = FirstRecurring.findFirstRecurring(input);
        assertNull(actual);
    }

    @Test
    public void shouldFindFirstRecurringLowercase() throws Exception {
        String input = "teetet";
        Character actual = FirstRecurring.findFirstRecurringAllLowercase(input);
        assertEquals('t', (char) actual);
    }

    @Test
    public void shouldNotFindFirstRecurringLowercase() throws Exception {
        String input = "abcdef";
        Character actual = FirstRecurring.findFirstRecurringAllLowercase(input);
        assertNull(actual);
    }
}