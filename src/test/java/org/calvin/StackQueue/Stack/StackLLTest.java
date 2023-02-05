/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackLLTest {
    private StackLL<Integer> fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StackLL<>();
    }

    @Test
    public void shouldShowAllEntries() {
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertEquals(6, fixture.getSize(), "Invalid StackSize, assert value: " + fixture.getSize());

        for (int i = 5; i >= 0; i--) {
            Integer tempint = (Integer) fixture.pop();
            assertEquals((int) tempint, i, "Invalid expected value: " + tempint);
        }
    }

    @Test
    public void shouldThrowExceptionEnQueue() {
        for (int i = 0; i < 40; i++) {
            fixture.push(i);
        }
        Exception exception =
                assertThrows(FullStackException.class, () ->
                    fixture.push(123));
        assertEquals("Stack is full!", exception.getMessage());
    }

        @Test
    public void shouldThrowExceptionDeQueue() {
        Exception exception =
                assertThrows(EmptyStackException.class, () ->
                    fixture.pop());
        assertEquals("Stack is empty!", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionPeek() {
        Exception exception =
                assertThrows(EmptyStackException.class, () ->
                    fixture.peek());
        assertEquals("Stack is empty!", exception.getMessage());
    }

    @Test
    public void shouldDoPeek() {
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertEquals(6, fixture.getSize(), "Invalid QueueSize, assert value: " + fixture.getSize());

        for (int i = 5; i >= 0; i--) {
            assertEquals((int) fixture.peek(), i, "Invalid expected value: " + fixture.peek());
            fixture.pop();
        }
    }

}
