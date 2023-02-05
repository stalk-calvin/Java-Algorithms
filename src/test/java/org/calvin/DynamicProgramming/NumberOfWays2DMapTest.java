package org.calvin.DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOfWays2DMapTest {

    @Test
    public void shouldCountNumberOfWaysSmaller() {
        assertEquals(2, NumberOfWays2DMap.numberOfWays(2,2));
    }

    @Test
    public void shouldCountNumberOfWays() {
        assertEquals(70, NumberOfWays2DMap.numberOfWays(5,5));
    }
}