/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import org.calvin.StackQueue.Stack.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MinStackTest {
    MinStack fixture;


    @BeforeEach
    public void setUp() {
        fixture = new MinStack();
    }

    @Test
    public void shouldPushInteger() {
        fixture.push(1);
        fixture.push(2);
        assertEquals(2, fixture.top());
    }

    @Test
    public void shouldRemoveInteger() {
        fixture.push(1);
        fixture.push(2);
        fixture.pop();
        assertEquals(1, fixture.top());
    }

    @Test
    public void shouldDoMinOperation() {
        assertEquals(0, fixture.getMin());
        fixture.push(2);
        assertEquals(2, fixture.getMin());
    }

    @Test
    public void shouldMaintainAndGetMin() {
        fixture.push(3);
        fixture.push(2);
        fixture.push(1);
        assertEquals(1, fixture.top());
        fixture.pop();
        assertEquals(2, fixture.top());
        fixture.pop();
        assertEquals(3, fixture.top());
    }

    @Test
    public void shouldThrowEmptyStackException() {
        fixture.push(3);
        fixture.pop();
        Exception exception =
                assertThrows(EmptyStackException.class, () ->
                    fixture.top());
    }

}
