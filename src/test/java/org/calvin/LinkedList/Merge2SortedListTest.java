/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Merge2SortedListTest {
    Merge2SortedList fixture;

    @Before
    public void setUp() {
        fixture = new Merge2SortedList();
    }

    @Test
    public void shouldFirstListComeFirst() {
        int[] vals = {1,2,3,4};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {14, 15, 16};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        ListNode actual = fixture.mergeTwoLists(list1, list2);
        int[] expectedVals = {1,2,3,4,14,15,16};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondListComeFirst() {
        int[] vals = {14,15,16};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {1,2,3,4};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        ListNode actual = fixture.mergeTwoLists(list1, list2);
        int[] expectedVals = {1,2,3,4,14,15,16};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMergeOneList() {
        int[] vals1 = {14, 15, 16};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals1);

        int[] expectedVals = {14,15,16};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);
        ListNode actual = fixture.mergeTwoLists(null, list1);

        assertEquals(expected, actual);

        actual = fixture.mergeTwoLists(list1, null);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMergeNullLists() {
        ListNode actual = fixture.mergeTwoLists(null,null);
        assertEquals(null, actual);
    }

}