/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.*;

public class MostFrequent {
    // function to search in top vector for element
    private int find(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == ele)
                return i;
        return -1;
    }

    // Function to print top k numbers
    public List<Integer> kTopStream(int[] a, int n, int k)
    {
        List<Integer> result = new ArrayList<>();
        // vector of size k+1 to store elements
        int[] top = new int[k + 1];

        // array to keep track of frequency
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < k + 1; i++)
            freq.put(i, 0);

        // iterate till the end of stream
        for (int m = 0; m < n; m++) {
            // increase the frequency
            if (freq.containsKey(a[m]))
                freq.put(a[m], freq.get(a[m]) + 1);
            else
                freq.put(a[m], 1);

            // store that element in top vector
            top[k] = a[m];

            // search in top vector for same element
            int i = find(top, a[m]);
            i -= 1;

            // iterate from the position of element to zero
            while (i >= 0) {
                // compare the frequency and swap if higher
                // frequency element is stored next to it
                if (freq.get(top[i]) < freq.get(top[i + 1])) {
                    int temp = top[i];
                    top[i] = top[i + 1];
                    top[i + 1] = temp;
                }

                // if frequency is same compare the elements
                // and swap if next element is high
                else if ((freq.get(top[i]) == freq.get(top[i + 1])) && (top[i] > top[i + 1])) {
                    int temp = top[i];
                    top[i] = top[i + 1];
                    top[i + 1] = temp;
                }

                else
                    break;
                i -= 1;
            }

            // print top k elements
            if (m == n-1) {
                for (int j = 0; j < k && top[j] != 0; ++j)
                    result.add(top[j]);
            }
        }
        System.out.println("done");

        return result;
    }

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
