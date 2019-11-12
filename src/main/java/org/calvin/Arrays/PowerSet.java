package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
    public <T> Set<Set<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new HashSet<Set<T>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<T>());
            return sets;
        }
        List<T> list = new ArrayList<T>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
        for (Set<T> set : powerSet(rest)) {
            Set<T> newSet = new HashSet<T>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
//            sets.add(set);
        }
        return sets;
    }

    public static List <List <Integer >> generatePowerSet(List <Integer > inputSet) {
        List <List <Integer >> powerSet = new ArrayList <>();
        directedPowerSet(inputSet , 0, new ArrayList <Integer >(), powerSet);
        return powerSet;
    }

    private static void directedPowerSet(List <Integer > inputSet , int toBeSelected ,
                                         List <Integer > selectedSoFar ,
                                         List <List <Integer >> powerSet) {
        if (toBeSelected == inputSet.size()) {
            powerSet.add(new ArrayList <>(selectedSoFar));
            return;
        }
        // Generate all subsets that contain inputSet[toBeSelected].
        selectedSoFar.add(inputSet.get(toBeSelected));
        directedPowerSet(inputSet , toBeSelected + 1, selectedSoFar , powerSet);
        // Generate all subsets that do not contain inputSet[toBeSelected].
        selectedSoFar.remove(selectedSoFar.size() - 1);
        directedPowerSet(inputSet , toBeSelected + 1, selectedSoFar , powerSet);
    }
}
