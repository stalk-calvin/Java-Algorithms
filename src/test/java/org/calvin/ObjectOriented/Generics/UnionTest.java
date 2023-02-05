package org.calvin.ObjectOriented.Generics;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UnionTest {

    @Test
    public void union() {
        Set<Integer> integers = new HashSet<Integer>();
        integers.add(1);
        integers.add(3);
        integers.add(5);

        Set<Double> doubles = new HashSet<Double>();
        doubles.add(2.0);
        doubles.add(4.0);
        doubles.add(6.0);

        Set<Number> numbers = Union.union(integers, doubles);

        for (Number x : numbers) {
            if (integers.contains(x.intValue())) {
                integers.remove(x.intValue());
            } else {
                doubles.remove(x.doubleValue());
            }
        }

        assertEquals(0, integers.size());
        assertEquals(0, doubles.size());
    }
}