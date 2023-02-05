package org.calvin.LinkedList;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveFromZeroSumTest {

    @Test
    public void removeZeroSumSublists() {
        final int[] vals = {2, -6, 6, -1, 1};
        ListNode<Integer> head = AssortedMethods.createLinkedListFromArray(vals);
        int[] expectedVals = {2};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveFromZeroSum.removeZeroSumSublists(head));
    }

    @Test
    public void removeZeroSumSublistSlightlyComplicated() {
        final int[] vals = {1,3,2,-3,-2,5,5,-5,1};
        ListNode<Integer> head = AssortedMethods.createLinkedListFromArray(vals);
        int[] expectedVals = {1,5,1};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveFromZeroSum.removeZeroSumSublists(head));
    }

    @Test
    public void removeZeroSumSublistsNoZero() {
        final int[] vals = {2, 4, -9, 2};
        ListNode<Integer> head = AssortedMethods.createLinkedListFromArray(vals);
        int[] expectedVals = {2, 4, -9, 2};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, RemoveFromZeroSum.removeZeroSumSublists(head));
    }
}