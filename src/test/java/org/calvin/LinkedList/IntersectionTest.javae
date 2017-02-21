/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionTest {
    Intersection fixture;

    @Before
    public void setUp() {
        fixture = new Intersection();
    }

    @Test
    public void shouldFindIntersectionNodeWhenFirstListLonger() {
        int[] vals = {1,3,5,7};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {12, 14, 15};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        // make an intersection by switching the node of list2 with list1
        list2.setNext(list1);

        ListNode actual = fixture.getIntersectionNode(list1, list2);

        assertEquals(list1, actual);
    }

    @Test
    public void shouldFindIntersectionNodeWhenSecondListLonger() {
        int[] vals = {1,3,5,7};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {12, 14, 15};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        // make an intersection by switching the node of list2 with list1
        list1.setNext(list2);

        ListNode actual = fixture.getIntersectionNode(list1, list2);

        assertEquals(list2, actual);
    }

    @Test
    public void shouldReturnNullWhenThereIsNoIntersection() {
        int[] vals = {1,3,5,7};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {12, 14, 15};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals);

        // make an intersection by switching the node of list2 with list1
        list1.setNext(list2);

        ListNode actual = fixture.getIntersectionNode(list1, list3);

        assertEquals(null, actual);
    }
}