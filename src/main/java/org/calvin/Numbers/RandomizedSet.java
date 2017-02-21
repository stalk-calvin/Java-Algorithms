/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import lombok.Data;

@Data
public class RandomizedSet {

    Set<Integer> rset;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        rset = new HashSet<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        return rset.add(val);
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (rset.isEmpty()) return false;
        if (rset.contains(val)) {
            rset.remove(val);
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if (rset.isEmpty()) return -1;
        int size = rset.size();
        int item = new Random().nextInt(size); // In real life, the Random object should be rather more shared than this
        int i = 0;
        for(Integer obj : rset)
        {
            if (i == item)
                return obj;
            i = i + 1;
        }
        return -1;
    }
}
