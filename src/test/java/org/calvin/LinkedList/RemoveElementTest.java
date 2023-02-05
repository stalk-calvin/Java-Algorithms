/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    @Test
    public void shouldRemoveElements() {
        int[] vals = {1,2,3,2,1};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {1,2,2,1};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveElement.removeElements(list1, 3));
    }

    @Test
    public void shouldRemoveFirstElements() {
        int[] vals = {1,1,1,2,1};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {2};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveElement.removeElements(list1, 1));
    }

    @Test
    public void shouldRemoveElementsMyWay() {
        int[] vals = {1,2,3,2,1};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {1,2,2,1};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveElement.removeElementsMyWay(list1, 3));
    }

    @Test
    public void shouldRemoveFirstElementsMyWay() {
        int[] vals = {1,1,1,2,1};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] expectedVals = {2};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveElement.removeElementsMyWay(list1, 1));
    }

}
