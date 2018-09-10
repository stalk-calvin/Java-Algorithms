package org.calvin.Arrays;

import java.util.*;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> d= calculateNextGreater(nums2);
        List<Integer> r=new ArrayList<>();
        for (int i=0; i < nums1.length;i++) {
            r.add(d.get(nums1[i]));
        }
        int[] array = new int[r.size()];
        for(int i = 0; i < r.size(); i++) array[i] = r.get(i);
        return array;
    }

    private Map<Integer,Integer> calculateNextGreater(int[] A) {
        Map<Integer,Integer> mapper = new HashMap<>();
        Stack<Integer> tracker = new Stack<>();
        for (int i=0; i < A.length;i++) {
            if (tracker.empty()) {
                tracker.push(A[i]);
                continue;
            }
            if (A[i] <= tracker.peek()) {
                tracker.push(A[i]);
            }
            else {
                while (!tracker.empty() && tracker.peek() < A[i]) {
                    mapper.put(tracker.pop(),A[i]);
                }
                tracker.push(A[i]);
            }
        }
        while (!tracker.empty()) {
            int a = tracker.pop();
            mapper.put(a, -1);
        }
        return mapper;
    }
}
