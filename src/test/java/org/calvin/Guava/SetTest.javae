/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCreateANewSet() {
        assertEquals(new HashSet<>(), Sets.newHashSet());
    }

    @Test
    public void shouldCreateANewSetWithElements() {
        Set<String> expected = new HashSet<>();
        expected.add("alpha");
        expected.add("beta");
        expected.add("gamma");
        Set<String> actual = Sets.newHashSet("alpha", "beta", "gamma");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCreateASetWithNegativeNumber() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("expectedSize");
        Set<String> actual = Sets.newHashSetWithExpectedSize(-2);
    }

    @Test
    public void shouldFindIntersectionInASet() {
        Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
        Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");

        Sets.SetView<String> intersection = Sets.intersection(primes, wordsWithPrimeLength);
        Set<String> actual = intersection.immutableCopy();
        Set<String> expected = Sets.newHashSet("two", "three", "seven");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldFindCartesianProduct() {
        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<String> fruits = ImmutableSet.of("apple", "orange", "banana");

        Set<List<String>> actual = Sets.cartesianProduct(animals, fruits);
        Set<List<String>> expected = Sets.newHashSet(
                Lists.newArrayList("gerbil", "apple"),
                Lists.newArrayList("gerbil", "orange"),
                Lists.newArrayList("gerbil", "banana"),
                Lists.newArrayList("hamster", "apple"),
                Lists.newArrayList("hamster", "orange"),
                Lists.newArrayList("hamster", "banana")
        );
        assertEquals(expected,actual);
    }

    @Test
    public void shouldFindPowerSet() {
        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<Set<String>> actual = Sets.powerSet(animals);
        Set<Set<String>> expected = Sets.newHashSet(
                Sets.newHashSet(),
                Sets.newHashSet("gerbil"),
                Sets.newHashSet("hamster"),
                Sets.newHashSet("gerbil","hamster")
        );
        assertEquals(expected,actual);
    }

    @Test
    public void shouldRemoveNullValues() {
        Set<String> input = Sets.newHashSet("a", null, "b", "c");
        Iterable<String> withoutNulls = Iterables.filter(input, Predicates.notNull());
        withoutNulls.forEach((x) -> assertFalse(x == null));
    }

    @Test
    public void shouldCreateImmutableSet() {
        expectedException.expect(UnsupportedOperationException.class);
        ImmutableSet<String> immutableSet = ImmutableSet.of("a", "b", "c");
        immutableSet.add("d");
    }

    @Test
    public void shouldCreateImmutableFromMutable() {
        expectedException.expect(UnsupportedOperationException.class);
        Set<String> mutableSet = Sets.newHashSet("alpha", "beta", "gamma");
        ImmutableSet<String> immutableSet = ImmutableSet.copyOf(mutableSet);
        immutableSet.add("delta");
    }
}
