/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        prev = null;
        next = null;
    }
}
public class LRUCache {

    Map<Integer,Node> cache;
    int capacity, count;
    Node head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        count = 0;
    }

    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public int get(int key){
        int value = -1;
        if (cache.get(key) != null) {
            //get the value
            Node n = cache.get(key);
            value = n.value;
            // delete existing node
            deleteNode(n);
            // add node to head
            addToHead(n);
        }
        return value;
    }

    public void set(int key, int value) {
        //if full remove oldest, add new one
        if (cache.get(key) != null) {
            Node node = cache.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        } else {
            Node node = new Node(key, value);
            cache.put(key, node);
            if (count < capacity) {
                count++;
                addToHead(node);
            } else {
                cache.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }
}
