/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        int maximumOf = 3; // 3rd max
        TreeSet<Integer> tracker = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (max < i) {
                max = i;
            }
            tracker.add(i);
        }

        Iterator<Integer> itr=tracker.iterator();
        while(itr.hasNext() && maximumOf > 1){
            itr.next();
            maximumOf--;
        }

        if (itr.hasNext()) {
            return itr.next();
        } else {
            return max;
        }
    }
}
