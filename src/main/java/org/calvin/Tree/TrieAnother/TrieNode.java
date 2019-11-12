package org.calvin.Tree.TrieAnother;

class TrieNode {
    // R links to node children
    private TrieNode[] links;

    // marks the end of string
    private boolean isEnd;

    TrieNode() {
        // English only
        links = new TrieNode[26];
    }

    boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }

    TrieNode get(char ch) {
        return links[ch -'a'];
    }

    void put(char ch, TrieNode node) {
        links[ch -'a'] = node;
    }

    void setEnd() {
        isEnd = true;
    }

    boolean isEnd() {
        return isEnd;
    }
}