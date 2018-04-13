/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.*;

public class MostFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        // since we are starting by putting 1 to the map.
        List<Integer>[] bucket = new List[nums.length+1];
        for(int n:map.keySet()){
            int freq = map.get(n);
            if(bucket[freq]==null)
                bucket[freq] = new LinkedList<>();
            bucket[freq].add(n);
        }

        List<Integer> res = new LinkedList<>();
        for(int i=bucket.length-1; i>0 && k>0; --i){
            if(bucket[i]!=null){
                List<Integer> list = bucket[i];
                res.addAll(list);
                k-= list.size();
            }
        }

        return res;
    }

    public int findFrequentInteger(int[] input) {
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i : input) {
            if (tracker.containsKey(i)) {
                tracker.put(i, tracker.get(i) + 1);
            } else {
                tracker.put(i, 1);
            }
        }
        //options: sort list by values and get max
        int result = 0;
        int maxOccurence = 0;
        for (Map.Entry<Integer,Integer> me : tracker.entrySet()) {
            if (me.getValue() > maxOccurence) {
                result = me.getKey();
                maxOccurence = me.getValue();
            }
        }
        return result;
    }

    public int findFrequentEfficient(int[] input) {
        Map<Integer, Integer> tracker = new HashMap<>();
        int result = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : input) {
            if (tracker.containsKey(i)) {
                tracker.put(i, tracker.get(i) + 1);
            } else {
                tracker.put(i, 1);
            }

            if (tracker.get(i) > max) {
                result = i;
                max = tracker.get(i);
            }
        }
        return result;
    }
}
