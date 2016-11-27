/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StackImplTest {
    private StackImpl fixture;

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
}