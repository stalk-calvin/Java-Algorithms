/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import org.junit.Test;

public class PermutationCombinationTest {
    private PermutationCombination fixture;

    @Test
    public void shouldGeneratePermutation() throws Exception {
        fixture = new PermutationCombination("abc");
        fixture.permute();
        List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        assertEquals(expected, fixture.getResult());
    }

    @Test
    public void shouldGenerateCombination() throws Exception {
        fixture = new PermutationCombination();
        char[] input = {'a', 'b'};
        fixture.combination(input, "", input.length, input.length);
        List<String> expected = Arrays.asList("aa", "ab", "ba", "bb");
        assertEquals(expected, fixture.getResult());
    }

    @Test
    public void shouldGenerateCombination2() throws Exception {
        List<List<Integer>> res = new ArrayList<>();
        PermutationCombination.combination2(4,2, 1, new ArrayList<Integer>(), res);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(1, 2),
                Lists.newArrayList(1, 3),
                Lists.newArrayList(1, 4),
                Lists.newArrayList(2, 3),
                Lists.newArrayList(2, 4),
                Lists.newArrayList(3, 4)
        );
        assertEquals(expected, res);
    }
}
