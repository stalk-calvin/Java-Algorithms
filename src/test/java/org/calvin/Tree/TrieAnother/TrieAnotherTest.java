package org.calvin.Tree.TrieAnother;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieAnotherTest {
    private Trie fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Trie();
    }

    @Test
    public void shouldRetainTRIEFunctionality() {
        fixture.insert("apple");

        assertTrue(fixture.search("apple"));

        assertFalse(fixture.search("app"));
        assertTrue(fixture.startsWith("app"));

        fixture.insert("app");
        fixture.search("app");

        fixture.insert("application");
        assertTrue(fixture.startsWith("app"));
        assertFalse(fixture.search("applica"));
        assertTrue(fixture.search("application"));
    }
}