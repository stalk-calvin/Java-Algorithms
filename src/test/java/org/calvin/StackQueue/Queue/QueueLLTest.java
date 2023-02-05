/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueLLTest {
    private QueueLL<Integer> fixture;

    @BeforeEach
    public void setUp() {
        fixture = new QueueLL<>();
    }
    @Test
    public void shouldShowAllEntries() throws EmptyQueueException {
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(i);
        }
        assertEquals(6, fixture.getSize(), "Invalid QueueSize, assert value: " + fixture.getSize());

        for (int i = 0; i < 6; i++) {
            Integer tempint = (Integer) fixture.dequeue();
            assertEquals((int) tempint, i, "Invalid expected value: " + tempint);
        }
    }

        @Test
    public void shouldThrowExceptionEnQueue() {
        for (int i = 0; i < 40; i++) {
            fixture.enqueue(i);
        }
        Exception exception =
                assertThrows(FullQueueException.class, () ->
                    fixture.enqueue(123));
        assertEquals("Queue is full!", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionDeQueue() {
        Exception exception =
                assertThrows(EmptyQueueException.class, () ->
                    fixture.dequeue());
        assertEquals("Queue is empty!", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionPeek() {
        Exception exception =
                assertThrows(EmptyQueueException.class, () ->
                    fixture.peek());
        assertEquals("Queue is empty!", exception.getMessage());
    }

    @Test
    public void shouldDoPeek() throws EmptyQueueException {
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(i);
        }
        assertEquals(6, fixture.getSize(), "Invalid QueueSize, assert value: " + fixture.getSize());

        for (int i = 0; i < 6; i++) {
            assertEquals((int) fixture.peek(), i, "Invalid expected value: " + fixture.peek());
            fixture.dequeue();
        }
    }

}
