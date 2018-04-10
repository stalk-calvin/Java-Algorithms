/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
    public void shouldGenerateAllPossibleCombination() throws Exception {
        fixture = new PermutationCombination();
        char[] input = {'a', 'b'};
        fixture.combination(input, "", input.length, input.length);
        List<String> expected = Arrays.asList("aa", "ab", "ba", "bb");
        assertEquals(expected, fixture.getResult());
    }

    @Test
    public void shouldGenerateNoRepetitionCombination() throws Exception {
        fixture = new PermutationCombination();
        fixture.combination3("", "ab");
        Set<String> expected = Sets.newHashSet("", "a", "ab", "b");
        assertEquals(expected, Sets.newHashSet(fixture.getResult()));
    }
}
