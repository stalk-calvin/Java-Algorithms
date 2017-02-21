/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers.Range;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeQuery {
    List<Range> r = new ArrayList<>();

    public Range get(int y) {
        // binary search
        int first = 0;
        int last = r.size() - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (r.get(mid).getStart() <= y && r.get(mid).getEnd() >= y) {
                return r.get(mid);
            } else if (r.get(mid).getEnd() < y) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return null; // not found
    }

    public void set(int s, int e) {
        removeCovered(s, e);
        Range newR = new Range(s, e);
        r.add(newR);
        Collections.sort(r);
    }

    private void removeCovered(int start, int end) {
        for (int i = 0; i < r.size(); i++) {
            if (start <= r.get(i).getStart() &&
                    end >= r.get(i).getEnd()) {
                r.remove(i);
            }
        }
    }
}
