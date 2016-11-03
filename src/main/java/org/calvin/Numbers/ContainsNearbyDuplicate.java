package org.calvin.Numbers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mark = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mark.add(nums[i])) {
                log.info("Duplicate Found! " + nums[i]);
                return true;
            }
            if (i >= k) {
                //remove first element;
                mark.remove(nums[i - k]);
            }
        }
        log.info("Duplicate Not Found!");
        return false;
    }
}
