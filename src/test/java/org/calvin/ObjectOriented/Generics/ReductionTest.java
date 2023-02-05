package org.calvin.ObjectOriented.Generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReductionTest {
    private List<Integer> intList = Arrays.asList(2, 7, 1, 8, 2, 8, 1, 8, 2, 8);
    private List<Double> doubleList = Arrays.asList(2.718281828, 3.141592654, 1.61803399);
    @Test
    public void shouldReduceGeneric() {
        assertEquals(8, Reduction.reduce(intList, Reduction.MAX, Integer.MIN_VALUE));
        assertEquals(3.141592654, Reduction.reduce(doubleList, Reduction.MAX, Double.NEGATIVE_INFINITY));
        assertEquals(47.0, Reduction.reduce(intList, Reduction.SUM, 0));
        assertEquals(7.477908472, Reduction.reduce(doubleList, Reduction.SUM, 0));
        assertEquals(229376.0, Reduction.reduce(intList, Reduction.PRODUCT, 1));
        assertEquals(13.81758023732284, Reduction.reduce(doubleList, Reduction.PRODUCT, 1));
    }
}