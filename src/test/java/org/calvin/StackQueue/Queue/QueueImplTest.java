/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueueImplTest {
    private QueueImpl fixture;

    @Test
    public void shouldShowAllEntries() throws EmptyQueueException {
        fixture = new QueueImpl(0);
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(new Integer(i));
        }
        assertTrue("Invalid QueueSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 6);

        for (int i = 0; i < 6; i++) {
            Integer tempint = (Integer) fixture.dequeue();
            assertTrue("Invalid expected value: "+tempint, tempint == i);
        }
    }

    @Test
    public void shouldResizeDouble() throws EmptyQueueException {
        fixture = new QueueImpl(1);
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(new Integer(i));
        }
        assertTrue("Invalid QueueSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 10);

        for (int i = 0; i < 6; i++) {
            Integer tempint = (Integer) fixture.dequeue();
            assertTrue("Invalid expected value: "+tempint, tempint == i);
        }
    }
}