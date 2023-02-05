/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SummaryRangesTest {
    private SummaryRanges fixture;

    @BeforeEach
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
