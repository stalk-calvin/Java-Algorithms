/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    int[] data;
    int size;

    public BinarySearch(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    public boolean binarySearch(int key) {
        int low = 0;
        int high = size - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;
            }
            if (data[middle] < key) {
                System.out.println("search higher");
                low = middle + 1;
            }
            if (data[middle] > key) {
                System.out.println("search lower");
                high = middle - 1;
            }
        }
        return false;
    }

    public boolean binarySearchRecursive(int[] items, int key) {
        if (items == null || items.length == 0) return false;
        if (items.length == 1) {
            return items[0] == key;
        }
        int i = items.length/2;
        if (key == items[i]) {
            return true;
        }
        if (key > items[i]) {
            items = Arrays.copyOfRange(items, i, items.length-1);
        } else {
            items = Arrays.copyOfRange(items, 0, i-1);
        }

        return binarySearchRecursive(items,key);
    }


}
