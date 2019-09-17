/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramGrouperTest {
    private AnagramGrouper fixture;

    @Before
    public void setUp() {
        fixture = new AnagramGrouper();
    }

    @Test
    public void shouldGroupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "atn", "bat"};
        List<List<String>> result = fixture.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
                Lists.newArrayList("eat", "tea", "ate"),
                Lists.newArrayList("tan","atn"),
                Lists.newArrayList("bat")
        );
        assertEquals(expected, result);
    }
}
