/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.ComparatorComparable;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;

    Dog() {
    }

    // Overriding the compareTo method
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Overriding the compare method to sort the age
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}