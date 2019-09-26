/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ComparatorComparable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@AllArgsConstructor
@Data
class Dog implements Comparable<Dog> {
    private String name;
    private int age;

    // Overriding the compareTo method
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }
}

class DogByAgeComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
