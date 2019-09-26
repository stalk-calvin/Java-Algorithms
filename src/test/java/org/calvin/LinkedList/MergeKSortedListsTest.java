/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.__Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeKSortedListsTest {
    MergeKSortedLists fixture;

    @Before
    public void setUp() {
        fixture = new MergeKSortedLists();
    }

    @Test
    public void shouldMergeKSortedLists() {
        ListNode[] klists = new ListNode[5];
        int[] vals = {1, 2, 3, 4};
        klists[0] = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {14, 15, 16};
        klists[1] = AssortedMethods.createLinkedListFromArray(vals2);
        int[] vals3 = {22, 35, 41};
        klists[2] = AssortedMethods.createLinkedListFromArray(vals3);
        int[] vals4 = {12, 34, 44};
        klists[3] = AssortedMethods.createLinkedListFromArray(vals4);
        int[] vals5 = {12, 25, 46};
        klists[4] = AssortedMethods.createLinkedListFromArray(vals5);

        int[] expected = {1, 2, 3, 4, 12, 12, 14, 15, 16, 22, 25, 34, 35, 41, 44, 46};
        ListNode expectedList = AssortedMethods.createLinkedListFromArray(expected);
        assertEquals(expectedList, fixture.mergeKSortedLists(klists));

    }

}
