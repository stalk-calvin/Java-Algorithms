/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCreateANewMap() {
        assertEquals(new HashMap<>(), Maps.newHashMap());
    }

    @Test
    public void shouldCreateANewMapWithElements() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("alpha", 1);
        expected.put("beta", 2);
        expected.put("gamma", 3);
        Map<String, Integer> actual = Maps.newHashMap(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCreateAMapWithNegativeNumber() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("expectedSize");
        Map<String, String> actual = Maps.newHashMapWithExpectedSize(-2);
    }

    @Test
    public void shouldFindDifferenceInAMap() {
        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> right = ImmutableMap.of("b", 2, "c", 4, "d", 5);
        MapDifference<String, Integer> actual = Maps.difference(left, right);
        actual.entriesDiffering().forEach((x,y) -> assertEquals("c", x));
    }


    @Test
    public void shouldFilterValues() {
        Map<Integer, String> input = ImmutableMap.of(1, "a", 2, "b", 3, "c");
        Map<Integer, String> filteredMap
                = Maps.filterValues(input, Predicates.contains(Pattern.compile("b")));
        filteredMap.forEach((x, y) -> assertTrue(y.equals("b")));
    }

    @Test
    public void shouldCreateImmutableMap() {
        expectedException.expect(UnsupportedOperationException.class);
        ImmutableMap<String, String> imutableMap =
                ImmutableMap.of("k1", "v1", "k2", "v2", "k3", "v3");
        imutableMap.put("k4", "v4");
    }

    @Test
    public void shouldMapBeSorted() {
        ImmutableSortedMap<String, Integer> actual = new ImmutableSortedMap
                .Builder<String, Integer>(Ordering.natural().reverse())
                .put("John", 1000)
                .put("Jane", 1500)
                .put("Adam", 2000)
                .put("Tom", 2000)
                .build();

        ImmutableMap expected = ImmutableMap.of("Tom", 2000, "John", 1000, "Jane", 1500, "Adam", 2000);

        assertEquals(expected,actual);
    }
}
