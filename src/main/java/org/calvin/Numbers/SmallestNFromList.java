package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestNFromList {

    // Sorting - O(nlogn)
    public List<Integer> findSmallestUsingSort(int[] input, int x) {
        List<Integer> result = new ArrayList<>();
        if (input == null || input.length < 1) {
            return result;
        }
        Arrays.sort(input);
        for (int i = 0; i < input.length && i < x; i++) {
            result.add(i);
        }
        return result;
    }

    // heapify - O(logn)
    // fetch min elements from heap - O(1)
    public List<Integer> findSmallestUsingHeap(int[] input, int x) {
        List<Integer> result = new ArrayList<>();
        if (input == null || input.length < 1) {
            return result;
        }
        if (input.length < x) {
            x = input.length;
        }
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(x, Integer::compareTo);
        for (int i = 0; i < x; i++) {
            pQueue.add(i);
        }
        for (int i = 0; i < x; i++) {
            result.add(pQueue.poll());
        }
        return result;
    }
}
