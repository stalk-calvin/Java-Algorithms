/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateFromSortedListTest {
    private RemoveDuplicateFromSortedList fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new RemoveDuplicateFromSortedList();
    }

    @Test
    public void removeDuplicates() throws Exception {
        int[] vals = {1,1,2,2,3,4,5};
        ListNode input = AssortedMethods.createLinkedListFromArray(vals);

        ListNode actual = fixture.removeDuplicates(input);

        int counter = 1;
        while (actual.getNext() != null) {
            assertEquals(counter, actual.getVal());
            actual = actual.getNext();
            counter++;
        }
    }

}