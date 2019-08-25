package org.calvin.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    @Data
    @AllArgsConstructor
    private class Item {
        private int arrayIndex;
        private int value;
    }

    public List<Integer> mergeKSortedArray(List<Integer>... lists) {
        PriorityQueue<Item> minHeap = new PriorityQueue<>(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        int totalElements = 0;
        for (int i = 0; i < lists.length; i++) {
            List<Integer> list = lists[i];
            totalElements += list.size();
            if (!list.isEmpty()) {
                minHeap.add(new Item(i, list.remove(0)));
            }
        }

        List<Integer> sortedList = new ArrayList<>();
        while (sortedList.size() < totalElements) {
            Item item = minHeap.poll();
            sortedList.add(item.getValue());

            List<Integer> list = lists[item.getArrayIndex()];
            if (!list.isEmpty()) {
                minHeap.add(new Item(item.getArrayIndex(), list.remove(0)));
            }
        }

        return sortedList;
    }
}
