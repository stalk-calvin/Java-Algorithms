/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.HashMap;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramGrouperTest {
    @Test
    public void shouldGroupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "atn", "bat"};
        List<List<String>> result = AnagramGrouper.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
                Lists.newArrayList("eat", "tea", "ate"),
                Lists.newArrayList("tan","atn"),
                Lists.newArrayList("bat")
        );
        assertEquals(expected, result);
    }
}
