/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateFromSortedList2Test {
    private RemoveDuplicateFromSortedList2 fixture;

    @BeforeEach
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
