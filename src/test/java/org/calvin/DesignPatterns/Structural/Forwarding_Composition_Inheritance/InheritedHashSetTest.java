package org.calvin.DesignPatterns.Structural.Forwarding_Composition_Inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class InheritedHashSetTest {
    private InheritedHashSet<String> fixture;
    @BeforeEach
    public void setUp() throws Exception {
        fixture = new InheritedHashSet<>();
    }

    @Test
    public void addAll() throws Exception {
        fixture.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        assertEquals(6, fixture.getAddCount());
    }

}