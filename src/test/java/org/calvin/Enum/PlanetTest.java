package org.calvin.Enum;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlanetTest {
    @Test
    public void shouldCalculateMassDifference() {
        assertEquals(1.893025E27, Planet.JUPITER.mass() - Planet.EARTH.mass(), 0.1);
    }

    @Test
    public void shouldCalculateRadiusDifference() {
        assertEquals(6.5112E7, Planet.JUPITER.radius() - Planet.EARTH.radius(), 0.1);
    }

    @Test
    public void shouldCalculateSurfaceGravityDifference() {
        assertEquals(14.993065343560914, Planet.JUPITER.surfaceGravity() - Planet.EARTH.surfaceGravity(), 0.1);
    }
}