/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MinStackNodeTest {
    private MinStackNode fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MinStackNode();
    }

    @Test
    public void shouldDoBasicStackOperation() {
        fixture.push(5);
        fixture.push(10);
        fixture.push(15);
        assertEquals(15, fixture.top());
        fixture.pop();
        assertEquals(10, fixture.top());
        fixture.push(3);
        fixture.push(30);
        fixture.push(1);
        assertEquals(1, fixture.getMin());
    }

    @Test
    public void shouldThrowExceptionOnEmptyStackPop() {
        assertThrows(EmptyStackException.class, () -> fixture.pop());
    }

    @Test
    public void shouldThrowExceptionOnEmptyStackTop() {
        assertThrows(EmptyStackException.class, () -> fixture.top());
    }

    @Test
    public void shouldGetMaxEmptyGetMin() {
        assertEquals(Integer.MAX_VALUE, fixture.getMin());
    }
}
