/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.calvin.LinkedList.ListNode;
import org.junit.Test;

public class AssortedMethodsTest {
    @Test
    public void shouldCreateRandomIntLessThanTen() {
        int actual = AssortedMethods.randomInt(10);
        assertTrue(actual < 10);
    }

    @Test
    public void shouldCreateRandomIntInRange() {
        int actual = AssortedMethods.randomIntInRange(5,10);
        assertTrue(5 <= actual && actual <= 10);
    }

    @Test
    public void shouldCreateRandomBoolean() {
        boolean actual = AssortedMethods.randomBoolean();
        assertTrue(actual || !actual);
    }

    @Test
    public void shouldCreateRandomBooleanWithPercentage() {
        boolean actual = AssortedMethods.randomBoolean(100);
        assertTrue(actual);
    }

    @Test
    public void shouldCreateRandomBooleanMatrix() {
        boolean[][] expected = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        boolean[][] actual = AssortedMethods.randomBooleanMatrix(3,3,100);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void shouldCreateRandomMatrix() {
        int[][] expected = {
                {3,3,3},
                {3,3,3},
                {3,3,3}
        };
        int[][] actual = AssortedMethods.randomMatrix(3,3,3,3);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void shouldCreateRandomArray() {
        int[] expected = {3,3,3};
        int[] actual = AssortedMethods.randomArray(3, 3, 3);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void shouldCreateRandomLinkedList() {
        int[] vals = {3, 3, 3};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(vals);
        ListNode<Integer> actual = AssortedMethods.randomLinkedList(3, 3, 3);
        assertEquals(expected,actual);
    }

    @Test
    public void linkedListWithValue() {
        int[] vals = {3, 3, 3};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(vals);
        ListNode<Integer> actual = AssortedMethods.linkedListWithValue(3, 3);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCreateLinkedListFromArray() {
        int[] vals = {3, 3, 3};
        ListNode<Integer> actual = AssortedMethods.createLinkedListFromArray(vals);
        int count = 0;
        while (actual != null) {
            assertTrue(vals[count] == actual.getVal());
            actual = actual.getNext();
            count++;
        }
    }

    @Test
    public void shouldIntArrayToString() {
        int[] vals = {3, 3, 3};
        String actual = AssortedMethods.arrayToString(vals);
        assertEquals("3, 3, 3", actual);
    }

    @Test
    public void shouldStringArrayToString() {
        String[] vals = {"a", "b", "c"};
        String actual = AssortedMethods.stringArrayToString(vals);
        assertEquals("a, b, c", actual);
    }

    @Test
    public void shouldShowBinaryString() {
        String actual = AssortedMethods.toFullBinaryString(3);
        assertEquals("00000000000000000000000000000011", actual);
    }

    @Test
    public void shouldShowToBaseNstring() {
        String actual = AssortedMethods.toBaseNString(16, 16);
        assertEquals("10", actual);
    }

    @Test
    public void shouldGetListOfWords() {
        String[] words = AssortedMethods.getListOfWords();
        assertEquals(2018, words.length);
    }
}
