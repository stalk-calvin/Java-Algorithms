package org.calvin.String;

import java.util.*;

public class TopKLongest {
    public List<String> topK(int k, Iterator<String> iter) {
        PriorityQueue<String > minHeap = new PriorityQueue<>(k, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        while (iter.hasNext()) {
            minHeap.add(iter.next());
            if (minHeap.size() > k) minHeap.poll();
        }
        return new ArrayList<>(minHeap);
    }
}
