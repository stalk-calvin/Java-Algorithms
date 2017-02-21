/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
    RemoveElement fixture;

    @Before
    public void setUp() {
        fixture = new RemoveElement();
    }

    @Test
    public void shouldRemoveElements() {
        int[] vals = {1,2,3,2,1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {1,2,2,1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.removeElements(list1, 3));
    }

    @Test
    public void shouldRemoveFirstElements() {
        int[] vals = {1,1,1,2,1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {2};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.removeElements(list1, 1));
    }

}