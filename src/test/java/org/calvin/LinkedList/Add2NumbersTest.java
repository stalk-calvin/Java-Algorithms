/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Add2NumbersTest {
    private static final int[] vals1 = {0, 0, 5};
    private static final int[] vals2 = {0, 0, 5};
    private Add2Numbers fixture;
    private ListNode number1;
    private ListNode number2;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new Add2Numbers();
        number1 = AssortedMethods.createLinkedListFromArray(vals1);
        number2 = AssortedMethods.createLinkedListFromArray(vals2);
    }

    @Test
    public void shouldAddTwoNumbers() throws Exception {
        int[] expectedArray = {0, 0, 0, 1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedArray);
        ListNode actual = fixture.addTwoNumbers(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddTwoNumbersAlternative() throws Exception {
        int[] expectedArray = {0, 0, 0, 1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedArray);
        ListNode actual = fixture.add(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddTwoNumbersIterative() throws Exception {
        int[] expectedArray = {0, 0, 0, 1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedArray);
        ListNode actual = fixture.addListsIterative(number1, number2);
        assertEquals(expected, actual);
    }
}
