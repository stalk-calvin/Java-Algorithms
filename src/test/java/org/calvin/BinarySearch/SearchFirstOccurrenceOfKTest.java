/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SearchFirstOccurrenceOfKTest {
    private SearchFirstOccurrenceOfK fixture;

    @Before public void setUp() throws Exception {
        fixture = new SearchFirstOccurrenceOfK();
    }

    @Test public void shouldFindRightFirstIndexInSortedArray() throws Exception {
        int[] input = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        assertEquals(3, fixture.firstIndexOf(input, 108));
    }

    @Test public void shouldFindLeftFirstIndexInSortedArray() throws Exception {
        int[] input = {-14, 2, 2, 2, 108, 108, 243, 285, 285, 285};
        assertEquals(1, fixture.firstIndexOf(input, 2));
    }

    @Test
    public void shouldNotFindAnyIndexOnNull() throws Exception {
        assertEquals(-1, fixture.firstIndexOf(null, 108));
    }

}
