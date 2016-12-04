/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import org.calvin.LinkedList.ListNode;
import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortListTest {
    MergeSortList fixture;

    @Before
    public void setUp() {
        fixture = new MergeSortList();
    }

    @Test
    public void shouldSortList() {
        int[] vals = {1,5,2,10,3,24,4};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        ListNode actual = fixture.sortList(list1);

        int[] expectedVals = {1,2,3,4,5,10,24};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnListWhenInputIsNull() {
        ListNode list1 = null;
        ListNode actual = fixture.sortList(list1);
        assertEquals(null, actual);
    }

}