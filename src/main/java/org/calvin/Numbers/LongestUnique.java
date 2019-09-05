package org.calvin.Numbers;

import java.util.*;

public class LongestUnique {
    public static List<Integer> longestTwoUnique(List<Integer> nums) {
        List<Integer> max = new ArrayList<>();
        for (int x = 0; x < nums.size(); x++) {
            Set<Integer> t = new HashSet<>();
            List<Integer> res = new ArrayList<>();
            int i = x;
            while (i < nums.size()) {
                int num = nums.get(i);
                if (t.size() == 2 && !t.contains(num)) {
                    if (max.isEmpty() || res.size() > max.size()) {
                        max = res;
                    }
                    t = new HashSet<>();
                    res = new ArrayList<>();
                    continue;
                }
                res.add(num);
                t.add(num);
                i++;
            }
            if (res.size() > max.size()) {
                max = res;
            }
        }
        return max;
    }

    public static int lengthOfLongestKUniqueCount(List<Integer> nums, int k) {
        int result = 0;
        int i=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int j=0; j<nums.size(); j++){
            int c = nums.get(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }

            if(map.size()<=k){
                result = Math.max(result, j-i+1);
            }else{
                while(map.size()>k){
                    int l = nums.get(i);
                    int count = map.get(l);
                    if(count==1){
                        map.remove(l);
                    }else{
                        map.put(l, map.get(l)-1);
                    }
                    i++;
                }
            }

        }

        return result;
    }

}
