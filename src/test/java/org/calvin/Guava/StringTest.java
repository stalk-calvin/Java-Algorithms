/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringTest {
    @Test
    public void shouldJoinStrings() {
        Joiner joiner = Joiner.on("; ").skipNulls();
        String actual = joiner.join("Harry", null, "Ron", "Hermione");
        assertEquals("Harry; Ron; Hermione", actual);
    }

    @Test
    public void shouldJoinStringsSimpler() {
        String actual = Joiner.on(",").join(Arrays.asList(1, 5, 7));
        assertEquals("1,5,7", actual);
    }

    @Test
    public void shouldSplitStrings() {
        Iterable<String> actual = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("foo,bar,,   qux");

        Set<String> expected = Sets.newHashSet("foo", "bar", "qux");
        actual.forEach((x) -> assertTrue(expected.contains(x)));
    }

    @Test
    public void shouldFilter() {
        CharMatcher filter = CharMatcher.anyOf("-.;").precomputed();
        String input = "a-b.c;";
        String actual = filter.removeFrom(input);
        assertEquals("abc", actual);
    }

    @Test
    public void shouldRetainDigits() {
        String input = "1a2bc3";
        String actual = CharMatcher.javaLetter().retainFrom(input);
        assertEquals("abc",actual);
    }

    @Test
    public void shouldGiveRightComparison() {
        List<Product> actual = Lists.newArrayList(
                new Product("a", "b"),
                new Product("b", "b"),
                new Product("c", "a"),
                new Product("a", "d"),
                new Product("a", "b"),
                new Product(null, null)
        );
        Collections.sort(actual);
        List<Product> expected = Lists.newArrayList(
                new Product(null, null),
                new Product("c", "a"),
                new Product("a", "b"),
                new Product("a", "b"),
                new Product("b", "b"),
                new Product("a", "d")
        );
        assertEquals(expected.toString(), actual.toString());
    }

}
