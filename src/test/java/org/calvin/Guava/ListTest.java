/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ListTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCreateANewList() {
        assertEquals(new ArrayList<>(), Lists.newArrayList());
    }

    @Test
    public void shouldCreateANewListWithElements() {
        List<String> expected = new ArrayList<>();
        expected.add("alpha");
        expected.add("beta");
        expected.add("gamma");
        List<String> actual = Lists.newArrayList("alpha", "beta", "gamma");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCreateAListWithNegativeNumber() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("initialArraySize");
        List<String> actual = Lists.newArrayListWithCapacity(-2);
    }

    @Test
    public void shouldReverseAList() {
        List<String> input = Lists.newArrayList("alpha", "beta", "gamma");
        List<String> actual = Lists.reverse(input);
        List<String> expected = Lists.newArrayList("gamma", "beta", "alpha");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPartitionList() {
        List<String> input = Lists.newArrayList("alpha", "beta", "gamma");
        List<List<String>> actual = Lists.partition(input, 2);
        List<List<String>> expected = Lists.newArrayList(Lists.newArrayList("alpha", "beta"), Lists.newArrayList("gamma"));
        assertEquals(expected,actual);
    }

    @Test
    public void shouldRemoveNullValues() {
        List<String> input = Lists.newArrayList("a", null, "b", "c");
        Iterable<String> withoutNulls = Iterables.filter(input, Predicates.notNull());
        withoutNulls.forEach((x) -> assertFalse(x == null));
    }

    @Test
    public void shouldCreateImmutableList() {
        expectedException.expect(UnsupportedOperationException.class);
        ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");
        immutableList.add("d");
    }

    @Test
    public void shouldCreateImmutableFromMutable() {
        expectedException.expect(UnsupportedOperationException.class);
        List<String> mutableList = Lists.newArrayList("alpha", "beta", "gamma");
        ImmutableList<String> immutableList = ImmutableList.copyOf(mutableList);
        immutableList.add("delta");
    }
}
