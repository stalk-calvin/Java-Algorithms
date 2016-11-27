/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super();
    }

    public EmptyStackException(String message) {
        super(message);
    }

    public EmptyStackException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyStackException(Throwable cause) {
        super(cause);
    }
}

