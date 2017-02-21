/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import lombok.extern.slf4j.Slf4j;
import org.calvin.LinkedList.ListNode;
import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@Slf4j
public class MergeSortListTest {
    MergeSortList fixture;

    @Before
    public void setUp() {
        fixture = new MergeSortList();
    }

    @Test
    public void shouldSortList() {
        int[] input = {9,30,5,11,7,10};
        log.info("MergeSortList: Input (Unsorted): " + Arrays.toString(input));
        ListNode list1 = AssortedMethods.createLinkedListFromArray(input);

        ListNode actual = fixture.sortList(list1);
        log.info("MergeSortList: Input (Sorted): " + actual.printForward());

        int[] expectedVals = {5,7,9,10,11,30};
        ListNode expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnListWhenInputIsNull() {
        ListNode list1 = null;
        ListNode actual = fixture.sortList(list1);
        assertEquals(null, actual);
    }

}
