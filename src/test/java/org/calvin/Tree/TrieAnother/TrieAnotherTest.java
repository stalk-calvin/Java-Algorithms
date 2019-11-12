package org.calvin.Tree.TrieAnother;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrieAnotherTest {
    private Trie fixture;

    @Before
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