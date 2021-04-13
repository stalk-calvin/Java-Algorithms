package org.calvin.Tree.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a,b);
            }
        });
        maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b,a);
            }
        });
    }

    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.remove());
        }
    }

    public double findMedian() {
        return maxHeap.size() > minHeap.size() ? (double) maxHeap.peek() : (maxHeap.peek() + minHeap.peek()) * .5;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
