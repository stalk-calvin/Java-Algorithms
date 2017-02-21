/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class Add2NumbersTest {
    private static final int[] vals1 = {2, 4, 3};
    private static final int[] vals2 = {5, 6, 4};
    private Add2Numbers fixture;
    private ListNode number1;
    private ListNode number2;

    @Before
    public void setUp() throws Exception {
        fixture = new Add2Numbers();
        number1 = AssortedMethods.createLinkedListFromArray(vals1);
        number2 = AssortedMethods.createLinkedListFromArray(vals2);
    }

    @Test
    public void shouldAddTwoNumbers() throws Exception {
        int[] expectedArray = {7, 0, 8};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedArray);
        ListNode actual = fixture.addTwoNumbers(number1, number2);
        assertEquals(expected, actual);
    }

}
