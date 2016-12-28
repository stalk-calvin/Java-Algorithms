package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        if(num==null ||num.length<3){
            return result;
        }

        int length = num.length;
        Arrays.sort(num);

        for(int i=0;i<length;i++){
            int left = i+1;
            int right = length-1;
            while(left<right){
                int sum = num[i] + num[left] + num[right];
                if(sum==0){
                    result.add(Arrays.asList(num[i], num[left], num[right]));
                    left++;
                    right--;
                    while(left<right&&num[left]==num[left-1]){
                        left++;
                    }
                    while(left<right&&num[right]==num[right+1]){
                        right--;
                    }
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        Set<List<Integer>> hs = new HashSet<>();
        hs.addAll(result);
        result.clear();
        result.addAll(hs);
        return result;
    }
}
