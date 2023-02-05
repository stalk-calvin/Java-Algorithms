package org.calvin.ObjectOriented.HashTable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
    private HashTable fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new HashTable();
        fixture.put(1, "I");
        fixture.put(2, "AM");
        fixture.put(3, "CALVIN");
        fixture.put(11, "LEE");
    }

    @Test
    public void shouldAddGetRemove() {
        assertEquals("LEE", fixture.get(11));
        fixture.remove(11);
        assertNull(fixture.get(11));
        fixture.put(11, "HELLO");
        assertEquals("HELLO", fixture.get(11));
    }
}