/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
    @Test
    public void shouldRemoveOneElement() {
        int[] input = {1,2,3,4,5};
        int length = RemoveElement.removeElement(input, 3);
        assertEquals(4, length);
        int[] expected = {1,2,4,5};
        int[] actual = Arrays.copyOfRange(input, 0, length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveFourElement() {
        int[] input = {3,1,3,2,3,4,5,3};
        int length = RemoveElement.removeElement(input, 3);
        assertEquals(4, length);
        int[] expected = {1,2,4,5};
        int[] actual = Arrays.copyOfRange(input, 0, length);
        assertArrayEquals(expected, actual);
    }
}
