/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.calvin.Tree.Trie.Trie.getOrderedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.calvin.Tree.Trie.Trie;
import org.calvin.Tree.Trie.TrieNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

public class TrieTest {
    private TrieNode fixture;
    private List<String> orderedList = Lists.newArrayList("a","b","c");

    @BeforeEach
    public void setUp() {
        fixture = new TrieNode();
        populateString();
    }

    @Test
    public void shouldListBeOrdered() {
        List<String> listOrdered = new ArrayList<>();
        getOrderedList(fixture, "", listOrdered);
        assertEquals(orderedList, listOrdered);
    }

    private void populateString() {
        for (String item : orderedList) {
            Trie.insertString(fixture, item);
        }
    }

}
