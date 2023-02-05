/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackImplTest {
    private StackImpl fixture;

    @Test
    public void shouldShowAllEntries() throws EmptyStackException {
        fixture = new StackImpl(0);
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertEquals(6, fixture.entryLength(), "Invalid StackSize, assert value: " + fixture.entryLength());

        for (int i = 5; i >= 0; i--) {
            Integer tempint = (Integer) fixture.pop();
            assertEquals((int) tempint, i, "Invalid expected value: " + tempint);
        }
    }

    @Test
    public void shouldResizeDouble() throws EmptyStackException {
        fixture = new StackImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertEquals(10, fixture.entryLength(), "Invalid StackSize, assert value: " + fixture.entryLength());

        for (int i = 5; i >= 0; i--) {
            Integer tempint = (Integer) fixture.pop();
            assertEquals((int) tempint, i, "Invalid expected value: " + tempint);
        }
    }


    @Test
    public void shouldThrowExceptionDeQueue() throws EmptyStackException {
        fixture = new StackImpl(1);
        Exception exception =
                assertThrows(EmptyStackException.class, () ->
                    fixture.pop());
        assertEquals("Stack Exception on pop: Stack empty", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionPeek() throws EmptyStackException {
        fixture = new StackImpl(1);
        Exception exception =
                assertThrows(EmptyStackException.class, () ->
                    fixture.peek());
        assertEquals("Stack Exception on peek: Stack empty", exception.getMessage());
    }

    @Test
    public void shouldDoPeek() throws EmptyStackException {
        fixture = new StackImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertEquals(10, fixture.entryLength(), "Invalid QueueSize, assert value: " + fixture.entryLength());
        assertEquals(6, fixture.size(), "Invalid QueueSize, assert value: " + fixture.size());

        for (int i = 5; i >= 0; i--) {
            assertEquals(fixture.peek(), i, "Invalid expected value: " + fixture.peek());
            fixture.pop();
        }
    }
}
