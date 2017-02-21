/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveLastNthNodeTest {
    RemoveLastNthNode fixture;

    @Before
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
