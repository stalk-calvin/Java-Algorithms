package org.calvin.HashMap;

import java.util.*;

public class BarProblem {
    public static int minDrinks(Map<Integer, Set<Integer>> input) {
        if (input.size() <= 1) {
            return input.size();
        }
        Map<Integer, Set<Integer>> reversedInput = createReverseMapping(input);

        int count = 0;
        while(!reversedInput.isEmpty()) {
            // sort by size
            List<Map.Entry<Integer, Set<Integer>>> list = sortedByValueLength(reversedInput);
            Set<Integer> customerIds = new HashSet<>(list.get(0).getValue());
            for (int customerId : customerIds) {
                // remove customer from each item
                removeCustomer(reversedInput, customerId);
            }
            reversedInput.entrySet().removeIf(integerSetEntry -> integerSetEntry.getValue().isEmpty());
            // Found a match
            count++;
        }

        return count;
    }

    private static void removeCustomer(Map<Integer, Set<Integer>> input, int customerId) {
        for (Map.Entry<Integer, Set<Integer>> entry : input.entrySet()) {
            entry.getValue().removeIf(cid -> cid == customerId);
        }
    }

    private static List<Map.Entry<Integer, Set<Integer>>> sortedByValueLength(Map<Integer, Set<Integer>> input) {
        List<Map.Entry<Integer, Set<Integer>>> ret = new ArrayList<>(input.entrySet());
        ret.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());
        return ret;
    }

    private static Map<Integer, Set<Integer>> createReverseMapping(Map<Integer, Set<Integer>> input) {
        Map<Integer, Set<Integer>> reversedMapping = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> entry : input.entrySet()) {
            for (int drinkId : entry.getValue()) {
                if (!reversedMapping.containsKey(drinkId)) {
                    reversedMapping.put(drinkId, new HashSet<>());
                }
                reversedMapping.get(drinkId).add(entry.getKey());
            }
        }
        return reversedMapping;
    }
}
