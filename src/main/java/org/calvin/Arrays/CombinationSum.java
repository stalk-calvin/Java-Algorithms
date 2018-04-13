package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] input, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (input == null) return result;
        if (input.length == 1) {
            if (input[0] == target) result.add(new ArrayList<>(input[0]));
            return result;
        }
        findSumRecursively(input, new ArrayList<>(), result, target, 0);
        return result;
    }

    private void findSumRecursively(int[] input, List<Integer> tempList, List<List<Integer>> result, int tracker, int start) {
        if (tracker < 0) return; // possible the value goes negative
        else if (tracker == 0) { // found a match
            result.add(new ArrayList<>(tempList));
        } else {
           for (int i = start; i < input.length; i++) {
               tempList.add(input[i]);
               findSumRecursively(input, tempList, result, tracker - input[i], i);
               tempList.remove(tempList.size() - 1); // remove last element to recurse with last element different
           }
        }
    }
}
