/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class PermutationCombinationTest {
    private PermutationCombination fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new PermutationCombination();
    }

    @Test
    public void shouldGeneratePermutation() throws Exception {
        fixture = new PermutationCombination("abc");
        fixture.permute();
        List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        assertEquals(expected, fixture.getResult());
    }

    @Test
    public void shouldGeneratePermutationArray() throws Exception {
        char[] input = {'a', 'b', 'c'};
        List<List<Character>> result = fixture.permute(input);
        Set<List<Character>> expected = Sets.newHashSet(
                Lists.newArrayList('a','b','c'),
                Lists.newArrayList('a','c','b'),
                Lists.newArrayList('b','a','c'),
                Lists.newArrayList('b','c','a'),
                Lists.newArrayList('c','a','b'),
                Lists.newArrayList('c','b','a')
        );
        for (List<Character> c : result) {
            if (!expected.remove(c)) {
                fail("FAIL");
            }
        }
    }

    @Test
    public void shouldGetAllPossibilities() throws Exception {
        List<String> result = fixture.showPossibilities("AAB");
        Set<String> expected = Sets.newHashSet("A", "AA", "AAB", "AB", "ABA", "B", "BA", "BAA");
        for (String x : result) {
            expected.remove(x);
        }
        assertTrue(expected.isEmpty());
    }

    @Test
    public void shouldGenerateAllPossibleCombination() throws Exception {
        char[] input = {'a', 'b'};
        fixture.combination(input, "", input.length, input.length);
        List<String> expected = Arrays.asList("aa", "ab", "ba", "bb");
        assertEquals(expected, fixture.getResult());
    }

    @Test
    public void shouldGenerateNoRepetitionCombination() throws Exception {
        fixture.combination3("", "ab");
        Set<String> expected = Sets.newHashSet("", "a", "ab", "b");
        assertEquals(expected, Sets.newHashSet(fixture.getResult()));
    }
}
