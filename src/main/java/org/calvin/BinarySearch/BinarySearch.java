/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

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


}
