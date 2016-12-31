package org.calvin.String;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Created by calvin.lee on 2016-12-25.
 */
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

}