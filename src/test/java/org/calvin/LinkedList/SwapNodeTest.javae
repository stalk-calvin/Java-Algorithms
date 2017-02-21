/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapNodeTest {
    SwapNode fixture;

    @Before
    public void setUp() {
        fixture = new SwapNode();
    }

    @Test
    public void shouldSwapPairs() {
        int[] vals = {1,2,3,4};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {2,1,4,3};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.swapPairs(list1));
    }

}