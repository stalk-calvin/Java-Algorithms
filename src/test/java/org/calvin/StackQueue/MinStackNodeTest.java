/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

public class MinStackNodeTest {
    private MinStackNode fixture;

    @Before
    public void setUp() {
        fixture = new MinStackNode();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldDoBasicStackOperation() {
        fixture.push(5);
        fixture.push(10);
        fixture.push(15);
        assertEquals(15, fixture.top());
        fixture.pop();
        assertEquals(10, fixture.top());
        fixture.push(3);
        fixture.push(30);
        fixture.push(1);
        assertEquals(1, fixture.getMin());
    }

    @Test
    public void shouldThrowExceptionOnEmptyStackPop() {
        expectedException.expect(EmptyStackException.class);
        fixture.pop();
    }

    @Test
    public void shouldThrowExceptionOnEmptyStackTop() {
        expectedException.expect(EmptyStackException.class);
        fixture.top();
    }
}