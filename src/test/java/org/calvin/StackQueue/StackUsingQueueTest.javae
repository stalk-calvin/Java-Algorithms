/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackUsingQueueTest {
    StackUsingQueue fixture;

    @Before
    public void setUp() {
        fixture = new StackUsingQueue();
        fixture.push(1);
        fixture.push(2);
    }

    @Test
    public void shouldAddToStack() {
        assertEquals(2, fixture.top());
    }

    @Test
    public void shouldRemoveFromStack() {
        fixture.pop();
        assertEquals(1, fixture.top());
    }

    @Test
    public void shouldCheckEmptyQueue() {
        fixture.pop();
        assertFalse(fixture.empty());
        fixture.pop();
        assertTrue(fixture.empty());
    }

}