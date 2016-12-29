package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateFromSortedList2Test {
    private RemoveDuplicateFromSortedList2 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new RemoveDuplicateFromSortedList2();
    }

    @Test
    public void removeDuplicates() throws Exception {
        int[] vals = {1,1,1,2,2,3,4,5};
        ListNode input = AssortedMethods.createLinkedListFromArray(vals);

        ListNode actual = fixture.removeDuplicates(input);

        int counter = 3;
        while (actual.getNext() != null) {
            assertEquals(counter, actual.getVal());
            actual = actual.getNext();
            counter++;
        }
    }
}