/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveLastNthNodeTest {
    RemoveLastNthNode fixture;

    @BeforeEach
    public void setUp() {
        fixture = new RemoveLastNthNode();
    }

    @Test
    public void removeNthFromEnd() {
        int[] vals = {1,2,3,2,1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {1,2,2,1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.removeNthFromEnd(list1, 3));
    }

}
