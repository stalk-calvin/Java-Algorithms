package org.calvin.HashMap;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class BarProblemTest {

    @Test
    public void shouldFindMinDrinks() {
        Map<Integer, Set<Integer>> preferences = new HashMap<>();
        preferences.put(0, Sets.newHashSet(0,1,3,6));
        preferences.put(1, Sets.newHashSet(1,4,7));
        preferences.put(2, Sets.newHashSet(2,4,7,5));
        preferences.put(3, Sets.newHashSet(3,2,5));
        preferences.put(4, Sets.newHashSet(5,8));

        assertEquals(2, BarProblem.minDrinks(preferences));
    }

    @Test
    public void shouldFindOneDrink() {
        Map<Integer, Set<Integer>> preferences = new HashMap<>();
        preferences.put(0, Sets.newHashSet(0,1,3,6));
        preferences.put(1, Sets.newHashSet(1,4,7));
        preferences.put(2, Sets.newHashSet(2,4,7,5,1));
        preferences.put(3, Sets.newHashSet(3,2,1,5));
        preferences.put(4, Sets.newHashSet(5,1,8));

        assertEquals(1, BarProblem.minDrinks(preferences));
    }

    @Test
    public void shouldFindForAllCustomers() {
        Map<Integer, Set<Integer>> preferences = new HashMap<>();
        preferences.put(0, Sets.newHashSet(0,3,6));
        preferences.put(1, Sets.newHashSet(9,4,7));
        preferences.put(2, Sets.newHashSet(2,12,5));
        preferences.put(3, Sets.newHashSet(19,1,11));
        preferences.put(4, Sets.newHashSet(13,8));

        assertEquals(5, BarProblem.minDrinks(preferences));
    }
}