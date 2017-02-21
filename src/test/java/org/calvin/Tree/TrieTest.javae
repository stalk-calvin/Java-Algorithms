/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.calvin.Tree.Trie.Trie.getOrderedList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.calvin.Tree.Trie.Trie;
import org.calvin.Tree.Trie.TrieNode;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class TrieTest {
    private TrieNode fixture;
    private List<String> orderedList = Lists.newArrayList("a","b","c");

    @Before
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