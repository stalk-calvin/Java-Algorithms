/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ComparatorComparable;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DogTest {
    private final List<Dog> list = Lists.newArrayList(
            new Dog("Lacy", 2),
            new Dog("Roger", 10),
            new Dog("Tommy", 4),
            new Dog("Tammy", 1)
    );

    @Test
    public void shouldSortUsingComparable() {
        Collections.sort(list);
        for (int j = 0; j < list.size()-1; j++) {
            assertTrue(list.get(j + 1).getName().compareTo(list.get(j).getName()) >= 0);
        }
    }

    @Test
    public void shouldSortUsingNameComparator() {
        list.sort(new DogByNameComparator());
        for (int j = 0; j < list.size()-1; j++) {
            assertTrue(list.get(j + 1).getName().compareTo(list.get(j).getName()) >= 0);
        }
    }

    @Test
    public void shouldSortUsingAgeComparator() {
        list.sort(new DogByAgeComparator());
        for (int j = 0; j < list.size()-1; j++) {
            assertTrue(list.get(j + 1).getAge() >= list.get(j).getAge());
        }
    }
}
