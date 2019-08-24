package org.calvin.ObjectOriented.HashTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class HashTable {
    private int numBuckets = 10;
    private List<LinkedList<Item>> lists = new ArrayList<>(numBuckets);
    private int numItems = 0;

    public HashTable() {
        initializeLists(lists);
    }

    public void put(int key, String value) {
        // Find the LinkedList that we should put the Item into.
        LinkedList<Item> list = findList(key);

        // See if we should overwrite an old Item.
        for (Item Item : list) {
            if (Item.key == key) {
                Item.val = value; // overwrites the old value.
                return;
            }
        }

        // Create new Item and add it to our LinkedList.
        list.add(new Item(key, value));
        numItems++;

        // Rehash if our load factor is too high.
        double loadFactor = (double) numItems / numBuckets;
        double LOAD_FACTOR = 0.8;
        if (loadFactor > LOAD_FACTOR) {
            rehash();
        }
    }

    public String get(int key) {
        // Find the LinkedList that may contain the value.
        LinkedList<Item> list = findList(key);

        for (Item Item : list) {
            if (Item.key == key) {
                return Item.val;
            }
        }
        // key doesn't exist.
        return null;
    }

    public void remove(int key) {
        // Find the LinkedList that may contain the value.
        LinkedList<Item> list = findList(key);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                list.remove(i);
                numItems--;
                return;
            }
        }
    }

    private int hashCode(int key) {
        return key % numBuckets;
    }

    private LinkedList<Item> findList(int key) {
        int hashCode = hashCode(key);
        return lists.get(hashCode);
    }

    private void rehash() {
        List<LinkedList<Item>> temp = lists;
        numBuckets *= 2;
        lists = new ArrayList<>(numBuckets);
        initializeLists(lists);
        numItems = 0;
        for (LinkedList<Item> list : temp) {
            for (Item Item : list) {
                put(Item.key, Item.val);
            }
        }
    }

    private void initializeLists(List<LinkedList<Item>> lists) {
        for (int i = 0; i < numBuckets; i++) {
            lists.add(new LinkedList<>());
        }
    }
}