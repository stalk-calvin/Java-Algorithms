/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SummaryRangesTest {
    private SummaryRanges fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new SummaryRanges();
    }

    @Test
    public void shouldGetSummaryRangesOneItem() throws Exception {
        int[] input = {1};
        List<String> actual = fixture.summaryRanges(input);
        assertEquals(Collections.singletonList("1"), actual);
    }

    @Test
    public void shouldGetSummaryRanges() throws Exception {
        int[] input = {1,2,3,7,8,10,12,13,14,17};
        List<String> actual = fixture.summaryRanges(input);
        assertEquals(Arrays.asList("1->3","7->8","10", "12->14", "17"), actual);
    }
}