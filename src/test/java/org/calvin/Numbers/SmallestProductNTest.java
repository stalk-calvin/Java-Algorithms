/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallestProductNTest {
    private SmallestProductN fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SmallestProductN();
    }

    @Test
    public void shouldFindSmallestProductOfN() {
        Stack<Integer> result = fixture.findSmallestProductOfN(10);

        String actual = "";
        while(!result.isEmpty()) {
            actual = actual + String.valueOf(result.pop());
        }

        String expected = "25";
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNotFindSmallestProductOfN() {
        Exception exception =
                assertThrows(RuntimeException.class, () ->
                    fixture.findSmallestProductOfN(17));
        assertEquals("No such number", exception.getMessage());
    }
}
