package org.calvin.Arrays;

import com.google.common.collect.Sets;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PowerSetTest {
    PowerSet fixture;

    @Before
    public void setUp() {
        fixture = new PowerSet();
    }

    @Test
    public void shouldFindPowerSet() throws Exception {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        Set<Set<Integer>> expected = new HashSet<>();
        expected.add(Sets.newHashSet());
        expected.add(Sets.newHashSet(1));
        expected.add(Sets.newHashSet(2));
        expected.add(Sets.newHashSet(3));
        expected.add(Sets.newHashSet(1,2));
        expected.add(Sets.newHashSet(1,3));
        expected.add(Sets.newHashSet(2,3));
        expected.add(Sets.newHashSet(1,2,3));
        for(Set<Integer> inner : fixture.powerSet(mySet)) {
            assertTrue(expected.contains(inner));
        }
    }

}