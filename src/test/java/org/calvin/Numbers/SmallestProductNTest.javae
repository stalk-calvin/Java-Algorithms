/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SmallestProductNTest {
    private SmallestProductN fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
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
    public void shouldNotFindSmallestProductOfN() throws Exception {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("No such number");

        fixture.findSmallestProductOfN(17);
    }
}