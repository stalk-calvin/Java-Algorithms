/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.google.common.collect.Lists;

public class SubsetsWithDuplicatesTest {
    @Test
    public void shouldShowSubsets() throws Exception {
        int[] input = {1, 2, 3};
        List<List<Integer>> actual = SubsetsWithDuplicates.subsetsWithDup(input);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(),
                Lists.newArrayList(1),
                Lists.newArrayList(2),
                Lists.newArrayList(1,2),
                Lists.newArrayList(3),
                Lists.newArrayList(1,3),
                Lists.newArrayList(2,3),
                Lists.newArrayList(1,2,3)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowSubsetsWithDupe() throws Exception {
        int[] input = {1, 2, 2, 3};
        List<List<Integer>> actual = SubsetsWithDuplicates.subsetsWithDup(input);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(),
                Lists.newArrayList(1),
                Lists.newArrayList(2),
                Lists.newArrayList(1,2),
                Lists.newArrayList(2,2),
                Lists.newArrayList(1,2,2),
                Lists.newArrayList(3),
                Lists.newArrayList(1,3),
                Lists.newArrayList(2,3),
                Lists.newArrayList(1,2,3),
                Lists.newArrayList(2,2,3),
                Lists.newArrayList(1,2,2,3)
        );
        assertEquals(expected, actual);
    }

}
