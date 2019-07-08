/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StackLLTest {
    private StackLL<Integer> fixture;

    @Before
    public void setUp() {
        fixture = new StackLL<>();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldShowAllEntries() {
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertTrue("Invalid StackSize, assert value: " + fixture.getSize(), fixture.getSize() == 6);

        for (int i = 5; i >= 0; i--) {
            Integer tempint = (Integer) fixture.pop();
            assertTrue("Invalid expected value: "+tempint, tempint == i);
        }
    }

    @Test
    public void shouldThrowExceptionEnQueue() {
        for (int i = 0; i < 40; i++) {
            fixture.push(i);
        }
        expectedException.expect(FullStackException.class);
        expectedException.expectMessage("Stack is full");
        fixture.push(123);
    }

        @Test
    public void shouldThrowExceptionDeQueue() {
        expectedException.expect(EmptyStackException.class);
        expectedException.expectMessage("Stack is empty");
        fixture.pop();
    }

    @Test
    public void shouldThrowExceptionPeek() {
        expectedException.expect(EmptyStackException.class);
        expectedException.expectMessage("Stack is empty");
        fixture.peek();
    }

    @Test
    public void shouldDoPeek() {
        for (int i = 0; i < 6; i++) {
            fixture.push(i);
        }
        assertTrue("Invalid QueueSize, assert value: " + fixture.getSize(), fixture.getSize() == 6);

        for (int i = 5; i >= 0; i--) {
            assertTrue("Invalid expected value: "+fixture.peek(), fixture.peek().equals(i));
            fixture.pop();
        }
    }

}
