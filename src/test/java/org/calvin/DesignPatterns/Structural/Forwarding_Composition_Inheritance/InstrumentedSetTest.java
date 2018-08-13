package org.calvin.DesignPatterns.Structural.Forwarding_Composition_Inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class InstrumentedSetTest {
    private InstrumentedSet<String> fixture;
    @Before
    public void setUp() throws Exception {
        Set<String> s = new HashSet<>();
        fixture = new InstrumentedSet<>(s);
    }

    @Test
    public void addAll() throws Exception {
        fixture.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        assertEquals(3, fixture.getAddCount());
    }
}