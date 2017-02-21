/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.ComparatorComparable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DogTest {

    private List<Dog> list;

    @Before
    public void setup() {
        list = new ArrayList<>();
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));
    }
    @Test
    public void shouldSortUsingComparable() {
        Collections.sort(list);
        for (int j = 0; j < list.size()-1; j++) {
            assertTrue(list.get(j + 1).getName().compareTo(list.get(j).getName()) >= 0);
        }
    }

    @Test
    public void shouldSortUsingComparator() {
        Collections.sort(list, new Dog());
        for (int j = 0; j < list.size()-1; j++) {
            assertTrue(list.get(j + 1).getAge() >= list.get(j).getAge());
        }
    }
}
