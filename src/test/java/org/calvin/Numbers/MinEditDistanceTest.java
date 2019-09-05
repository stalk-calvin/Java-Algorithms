package org.calvin.Numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinEditDistanceTest {
    @Test
    public void shouldCalculateMinDistance() {
        assertEquals(2, MinEditDistance.minDistance("biting", "sitting", 0, 0));
        assertEquals(3, MinEditDistance.minDistance("tassa", "passato", 0, 0));
        assertEquals(5, MinEditDistance.minDistance("calvin", "lee", 0, 0));
        assertEquals(4, MinEditDistance.minDistance("iphone", "ifunk", 0, 0));
        assertEquals(3, MinEditDistance.minDistance("earphone", "earpiece", 0, 0));
    }

}