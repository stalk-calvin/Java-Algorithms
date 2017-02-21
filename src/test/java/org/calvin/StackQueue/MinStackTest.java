/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MinStackTest {
    MinStack fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
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
        expectedException.expect(EmptyStackException.class);

        fixture.push(3);
        fixture.pop();
        fixture.top();
    }

}