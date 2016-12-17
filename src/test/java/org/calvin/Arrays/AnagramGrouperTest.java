/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class AnagramGrouperTest {
    AnagramGrouper fixture;

    @Before
    public void setUp() {
        fixture = new AnagramGrouper();
    }

    @Test
    public void shouldGroupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "atn", "bat"};
        List<List<String>> result = fixture.groupAnagrams(input);
        List<List<String>> expected = Lists.newArrayList(
                Lists.newArrayList("ate", "eat","tea"),
                Lists.newArrayList("atn","tan"),
                Lists.newArrayList("bat")
        );
        assertEquals(expected, result);
    }
}