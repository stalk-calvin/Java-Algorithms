/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QueueLLTest {
    private QueueLL<Integer> fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new QueueLL<>();
    }
    @Test
    public void shouldShowAllEntries() throws EmptyQueueException {
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(i);
        }
        assertTrue("Invalid QueueSize, assert value: " + fixture.getSize(), fixture.getSize() == 6);

        for (int i = 0; i < 6; i++) {
            Integer tempint = (Integer) fixture.dequeue();
            assertTrue("Invalid expected value: "+tempint, tempint == i);
        }
    }

        @Test
    public void shouldThrowExceptionEnQueue() {
        for (int i = 0; i < 40; i++) {
            fixture.enqueue(i);
        }
        expectedException.expect(FullQueueException.class);
        expectedException.expectMessage("Queue is full!");
        fixture.enqueue(123);
    }

    @Test
    public void shouldThrowExceptionDeQueue() {
        expectedException.expect(EmptyQueueException.class);
        expectedException.expectMessage("Queue is empty!");
        fixture.dequeue();
    }

    @Test
    public void shouldThrowExceptionPeek() {
        expectedException.expect(EmptyQueueException.class);
        expectedException.expectMessage("Queue is empty!");
        fixture.peek();
    }

    @Test
    public void shouldDoPeek() throws EmptyQueueException {
        for (int i = 0; i < 6; i++) {
            fixture.enqueue(i);
        }
        assertTrue("Invalid QueueSize, assert value: " + fixture.getSize(), fixture.getSize() == 6);

        for (int i = 0; i < 6; i++) {
            assertTrue("Invalid expected value: "+fixture.peek(), fixture.peek().equals(i));
            fixture.dequeue();
        }
    }

}

/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

//package org.calvin.StackQueue.Queue;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
//import static org.junit.Assert.assertTrue;
//
//public class QueueImplTest {
//    private QueueImpl fixture;
//
//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();
//
//    @Test
//    public void shouldShowAllEntries() throws EmptyQueueException {
//        fixture = new QueueImpl(0);
//        for (int i = 0; i < 6; i++) {
//            fixture.enqueue(new Integer(i));
//        }
//        assertTrue("Invalid QueueSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 6);
//
//        for (int i = 0; i < 6; i++) {
//            Integer tempint = (Integer) fixture.dequeue();
//            assertTrue("Invalid expected value: "+tempint, tempint == i);
//        }
//    }
//
//    @Test
//    public void shouldResizeDouble() throws EmptyQueueException {
//        fixture = new QueueImpl(1);
//        for (int i = 0; i < 6; i++) {
//            fixture.enqueue(new Integer(i));
//        }
//        assertTrue("Invalid QueueSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 10);
//
//        for (int i = 0; i < 6; i++) {
//            Integer tempint = (Integer) fixture.dequeue();
//            assertTrue("Invalid expected value: "+tempint, tempint == i);
//        }
//    }
//
//    @Test
//    public void shouldThrowExceptionDeQueue() throws EmptyQueueException {
//        fixture = new QueueImpl(1);
//        expectedException.expect(EmptyQueueException.class);
//        expectedException.expectMessage("Queue Exception on dequeue: Queue empty");
//        fixture.dequeue();
//    }
//
//    @Test
//    public void shouldThrowExceptionPeek() throws EmptyQueueException {
//        fixture = new QueueImpl(1);
//        expectedException.expect(EmptyQueueException.class);
//        expectedException.expectMessage("Queue Exception on peek: Queue empty");
//        fixture.peek();
//    }
//
//    @Test
//    public void shouldDoPeek() throws EmptyQueueException {
//        fixture = new QueueImpl(1);
//        for (int i = 0; i < 6; i++) {
//            fixture.enqueue(new Integer(i));
//        }
//        assertTrue("Invalid QueueSize, assert value: " + fixture.entryLength(), fixture.entryLength() == 10);
//        assertTrue("Invalid QueueSize, assert value: " + fixture.size(), fixture.size() == 6);
//
//        for (int i = 0; i < 6; i++) {
//            assertTrue("Invalid expected value: "+fixture.peek(), fixture.peek().equals(i));
//            fixture.dequeue();
//        }
//    }
//}
