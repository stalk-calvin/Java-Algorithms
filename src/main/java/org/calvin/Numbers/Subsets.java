package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void populateSubsets(List<List<Integer>> subsets, List<Integer> list) {
        if (list.isEmpty()) {
            subsets.add(new ArrayList<>());
            return;
        }

        int num = list.get(0);
        list.remove(0);

        populateSubsets(subsets, list);

        List<List<Integer>> currentList = new ArrayList<>(subsets);
        for (List<Integer> current : currentList) {
            List<Integer> newSubSet = new ArrayList<>(current);
            newSubSet.add(num);
            subsets.add(newSubSet);
        }
    }
}
