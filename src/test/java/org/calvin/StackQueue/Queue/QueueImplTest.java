/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueImplTest {
    private QueueImpl fixture;

    @Test
    public void shouldShowAllEntries() throws EmptyQueueException {
        fixture = new QueueImpl(0);
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(new Integer(i));
        }
        assertEquals(6, fixture.entryLength(), "Invalid QueueSize, assert value: " + fixture.entryLength());

        for (int i = 0; i < 6; i++) {
            Integer tempint = (Integer) fixture.dequeue();
            assertEquals((int) tempint, i, "Invalid expected value: " + tempint);
        }
    }

    @Test
    public void shouldResizeDouble() throws EmptyQueueException {
        fixture = new QueueImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(i);
        }
        assertEquals(10, fixture.entryLength(), "Invalid QueueSize, assert value: " + fixture.entryLength());

        for (int i = 0; i < 6; i++) {
            Integer tempint = (Integer) fixture.dequeue();
            assertEquals((int) tempint, i, "Invalid expected value: " + tempint);
        }
    }

    @Test
    public void shouldThrowExceptionDeQueue() throws EmptyQueueException {
        fixture = new QueueImpl(1);
        Exception exception =
                assertThrows(EmptyQueueException.class, () ->
                    fixture.dequeue());
        assertEquals("Queue Exception on dequeue: Queue empty", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionPeek() throws EmptyQueueException {
        fixture = new QueueImpl(1);
        Exception exception =
                assertThrows(EmptyQueueException.class, () ->
                    fixture.peek());
        assertEquals("Queue Exception on peek: Queue empty", exception.getMessage());
    }

    @Test
    public void shouldDoPeek() throws EmptyQueueException {
        fixture = new QueueImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(i);
        }
        assertEquals(10, fixture.entryLength(), "Invalid QueueSize, assert value: " + fixture.entryLength());
        assertEquals(6, fixture.size(), "Invalid QueueSize, assert value: " + fixture.size());

        for (int i = 0; i < 6; i++) {
            assertEquals(fixture.peek(), i, "Invalid expected value: " + fixture.peek());
            fixture.dequeue();
        }
    }
}
