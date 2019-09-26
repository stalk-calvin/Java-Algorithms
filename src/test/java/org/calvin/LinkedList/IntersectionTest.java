/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.__Utils.AssortedMethods;
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
        int[] vals3 = {99,98,97};
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals3);

        // make an intersection by switching the node of list2 with list1
        list1.getNext().getNext().getNext().setNext(list3);
        list2.getNext().getNext().setNext(list3);

        ListNode actual = fixture.getIntersectionNode(list1, list2);

        assertEquals(list3, actual);
    }

    @Test
    public void shouldFindIntersectionNodeWhenSecondListLonger() {
        int[] vals = {12, 14, 15};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {1,3,5,7};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);
        int[] vals3 = {99,98,97};
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals3);

        // make an intersection by switching the node of list2 with list1
        list1.getNext().getNext().setNext(list3);
        list2.getNext().getNext().getNext().setNext(list3);

        ListNode actual = fixture.getIntersectionNode(list1, list2);

        assertEquals(list3, actual);
    }

    @Test
    public void shouldReturnNullWhenThereIsNoIntersection() {
        int[] vals = {1,3,5,7};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals);
        ListNode actual = fixture.getIntersectionNode(list1, list3);

        assertEquals(null, actual);
    }

    @Test
    public void shouldFindIntersectionNodeWhenFirstListLongerMyWay() {
        int[] vals = {1,3,5,7};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {12, 14, 15};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);
        int[] vals3 = {99,98,97};
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals3);

        // make an intersection by switching the node of list2 with list1
        list1.getNext().getNext().getNext().setNext(list3);
        list2.getNext().getNext().setNext(list3);

        ListNode actual = fixture.getIntersectionNodeMyWay(list1, list2);

        assertEquals(list3, actual);
    }

    @Test
    public void shouldFindIntersectionNodeWhenSecondListLongerMyWay() {
        int[] vals = {12, 14, 15};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {1,3,5,7};
        ListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);
        int[] vals3 = {99,98,97};
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals3);

        // make an intersection by switching the node of list2 with list1
        list1.getNext().getNext().setNext(list3);
        list2.getNext().getNext().getNext().setNext(list3);

        ListNode actual = fixture.getIntersectionNodeMyWay(list1, list2);

        assertEquals(list3, actual);
    }

    @Test
    public void shouldReturnNullWhenThereIsNoIntersectionMyWay() {
        int[] vals = {1,3,5,7};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        ListNode list3 = AssortedMethods.createLinkedListFromArray(vals);

        ListNode actual = fixture.getIntersectionNodeMyWay(list1, list3);

        assertEquals(null, actual);
    }
}
