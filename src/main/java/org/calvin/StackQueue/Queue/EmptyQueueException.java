/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

public class EmptyQueueException extends Exception {
    public EmptyQueueException() {
        super();
    }

    public EmptyQueueException(String message) {
        super(message);
    }

    public EmptyQueueException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyQueueException(Throwable cause) {
        super(cause);
    }
}
