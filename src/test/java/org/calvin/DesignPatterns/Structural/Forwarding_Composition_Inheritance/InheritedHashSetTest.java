package org.calvin.DesignPatterns.Structural.Forwarding_Composition_Inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InheritedHashSetTest {
    private InheritedHashSet<String> fixture;
    @Before
    public void setUp() throws Exception {
        fixture = new InheritedHashSet<>();
    }

    @Test
    public void addAll() throws Exception {
        fixture.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        assertEquals(6, fixture.getAddCount());
    }

}