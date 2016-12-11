/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class StackImplTest {
    private StackImpl fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldShowAllEntries() throws EmptyStackException {
        fixture = new StackImpl(0);
        for (int i = 0; i < 6; i++) {
            fixture.push(new Integer(i));
        }
        assertTrue("Invalid StackSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 6);

        for (int i = 5; i >= 0; i--) {
            Integer tempint = (Integer) fixture.pop();
            assertTrue("Invalid expected value: "+tempint, tempint == i);
        }
    }

    @Test
    public void shouldResizeDouble() throws EmptyStackException {
        fixture = new StackImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.push(new Integer(i));
        }
        assertTrue("Invalid StackSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 10);

        for (int i = 5; i >= 0; i--) {
            Integer tempint = (Integer) fixture.pop();
            assertTrue("Invalid expected value: "+tempint, tempint == i);
        }
    }


    @Test
    public void shouldThrowExceptionDeQueue() throws EmptyStackException {
        fixture = new StackImpl(1);
        expectedException.expect(EmptyStackException.class);
        expectedException.expectMessage("Stack Exception on pop: Stack empty");
        fixture.pop();
    }

    @Test
    public void shouldThrowExceptionPeek() throws EmptyStackException {
        fixture = new StackImpl(1);
        expectedException.expect(EmptyStackException.class);
        expectedException.expectMessage("Stack Exception on peek: Stack empty");
        fixture.peek();
    }

    @Test
    public void shouldDoPeek() throws EmptyStackException {
        fixture = new StackImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.push(new Integer(i));
        }
        assertTrue("Invalid QueueSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 10);
        assertTrue("Invalid QueueSize, assert value: " + fixture.size(), fixture.size() == 6);

        for (int i = 5; i >= 0; i--) {
            assertTrue("Invalid expected value: "+fixture.peek(), fixture.peek().equals(i));
            fixture.pop();
        }
    }
}