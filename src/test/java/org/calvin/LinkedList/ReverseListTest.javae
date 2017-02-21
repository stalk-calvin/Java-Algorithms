/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseListTest {
    ReverseList fixture;

    @Before
    public void setUp() {
        fixture = new ReverseList();
    }

    @Test
    public void shouldReverseList() {
        int[] vals = {1,2,3,4};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {4,3,2,1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.reverseList(list1));
    }

    @Test
    public void shouldReverseListIfNull() {
        int[] vals = {1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.reverseList(list1));
        assertEquals(null, fixture.reverseList(null));
    }

}