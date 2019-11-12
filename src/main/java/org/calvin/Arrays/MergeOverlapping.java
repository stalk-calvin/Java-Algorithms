package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeOverlapping {
    static List<Interval> mergeAnotherWay(List<Interval> intervals) {
        LinkedList<Interval> result = new LinkedList<>();
        if (intervals == null) {
            return result;
        }
        intervals.sort(Comparator.comparingInt(Interval::getStart));
        for (Interval iv : intervals) {
            if (result.isEmpty() || result.getLast().end < iv.end) {
                result.add(iv);
            } else {
                result.getLast().end = Math.max(result.getLast().end, iv.end);
            }
        }
        return result;
    }
    static List<Interval> mergeOverlappingInterval(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        if (intervals == null) {
            return result;
        }
        intervals.sort(Comparator.comparingInt(Interval::getStart).thenComparing(Comparator.comparingInt(Interval::getEnd).reversed()));
        Interval t = intervals.get(0);
        for (Interval iv : intervals) {
            if (t.end < iv.end) {
                result.add(t);
                t = iv;
            }
        }

        if (!result.contains(t)) {
            result.add(t);
        }

        return result;
    }
}
