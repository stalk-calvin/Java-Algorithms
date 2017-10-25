/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Search;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {
    private SearchInsertPosition fixture;
    @Before public void setUp() throws Exception {
        fixture = new SearchInsertPosition();
    }

    @Test public void searchInsertPositionRightEnd() throws Exception {
        int[] input = {1,3,5,6};
        assertEquals(4, fixture.searchInsertPosition(input, 10));
    }

    @Test public void searchInsertPositionLeftEnd() throws Exception {
        int[] input = {1,3,5,6};
        assertEquals(0, fixture.searchInsertPosition(input, 0));
    }

    @Test public void searchInsertPositionMiddle() throws Exception {
        int[] input = {1,3,5,6};
        assertEquals(2, fixture.searchInsertPosition(input, 4));
    }

    @Test public void searchInsertPositionMiddleWithHit() throws Exception {
        int[] input = {1,3,5,6};
        assertEquals(1, fixture.searchInsertPosition(input, 3));
    }
}
