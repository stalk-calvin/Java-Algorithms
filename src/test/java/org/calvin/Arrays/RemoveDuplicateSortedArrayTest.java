/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicateSortedArrayTest {
    RemoveDuplicateSortedArray fixture;

    @Before
    public void setUp() {
        fixture = new RemoveDuplicateSortedArray();
    }

    @Test
    public void shouldRemoveDuplicates() {
        int[] input = {1,1,2,2,2,3,4,5};

        int actual = fixture.removeDuplicates(input);

        int[] expectedArray = {1,2,3,4,5};
        int[] actualArray = new int[actual];

        System.arraycopy(input,0,actualArray,0,actual);

        assertEquals(5,actual);
        assertTrue(Arrays.equals(expectedArray,actualArray));
    }

    @Test
    public void shouldNotEvenTryToRemoveDuplicates() {
        int actual = fixture.removeDuplicates(null);
        assertEquals(0,actual);

        actual = fixture.removeDuplicates(new int[0]);
        assertEquals(0,actual);
    }


    @Test
    public void shouldRemoveDuplicatesMyWay() {
        int[] input = {1,1,1,1,2,2,2,2,2,3,4,4,4,5};

        int actual = fixture.removeDuplicatesMyWay(input);

        int[] expectedArray = {1,2,3,4,5};
        int[] actualArray = new int[actual];

        System.arraycopy(input,0,actualArray,0,actual);

        assertEquals(5,actual);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldRemoveDuplicatesMyWayTwo() {
        int[] input = {1,1,1,1,2,2,2,2,2,3,4,4,4,5,5,5,5};

        int actual = fixture.removeDuplicatesMyWayTwo(input);

        int[] expectedArray = {1,2,3,4,5};
        int[] actualArray = new int[actual];

        System.arraycopy(input,0,actualArray,0,actual);

        assertEquals(5,actual);
        assertArrayEquals(expectedArray, actualArray);
    }
}
