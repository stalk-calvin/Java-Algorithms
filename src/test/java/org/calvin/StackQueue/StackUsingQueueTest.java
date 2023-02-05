/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackUsingQueueTest {
    StackUsingQueue fixture;

    @BeforeEach
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
