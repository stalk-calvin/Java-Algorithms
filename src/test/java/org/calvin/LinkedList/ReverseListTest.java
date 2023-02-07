/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {
    ReverseList fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ReverseList();
    }

    @Test
    public void shouldReverseList() {
        int[] vals = {1,2,3,4};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {4,3,2,1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.reverseList(list1));
    }

    @Test
    public void shouldReverseListIfNull() {
        int[] vals = {1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {1};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, fixture.reverseList(list1));
        assertEquals(null, fixture.reverseList(null));
    }

}
