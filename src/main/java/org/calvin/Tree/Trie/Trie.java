/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree.Trie;

import java.util.List;

public class Trie {
    // https://en.wikipedia.org/wiki/Trie
    public static void insertString(TrieNode root, String s) {
        TrieNode cur = root;
        for (char ch : s.toCharArray()) {
            if (cur.children[ch] == null) {
                cur.children[ch] = new TrieNode();
            }
            cur = cur.children[ch];
        }
        cur.leaf = true;
    }

    public static void getOrderedList(TrieNode node, String s, List<String> orderedList) {
        for (char ch = 0; ch < node.children.length; ch++) {
            TrieNode child = node.children[ch];
            if (child != null)
                getOrderedList(child, s + ch, orderedList);
        }
        if (node.leaf) {
            orderedList.add(s);
        }
    }
}
