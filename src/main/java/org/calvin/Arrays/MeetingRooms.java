package org.calvin.Arrays;

import java.util.*;

public class MeetingRooms {
    static class Interval {
        int start;
        int end;
        Interval(int s, int e) { start = s; end = e; }
    }

    public int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0;
        int endsItr = 0;
        for(int i=0; i<starts.length; i++) {
            if(starts[i]<ends[endsItr])
                rooms++;
            else
                endsItr++;
        }
        return rooms;
    }

    public int minMeetingRoomsTreeMap(Interval[] intervals) {
        Map<Integer, Integer> t = new TreeMap<>();
        for(Interval e : intervals) {
            t.put(e.start, t.getOrDefault(e.start,0)+1);
            t.put(e.end, t.getOrDefault(e.end,0)-1);
        }

        int cur = 0;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e : t.entrySet()) {
            cur += e.getValue();
            if (cur > max) {
                max = cur;
            }
        }

        return max;
    }

    public int minMeetingRoomsBuckets(Interval[] intervals) {
        if (intervals == null) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (Interval x : intervals) {
            if (x.end > max) {
                max = x.end;
            }
        }

        int[] tracker = new int[max+1];
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i].start; j < intervals[i].end; j++) {
                tracker[j]++;
            }
        }

        max = Integer.MIN_VALUE;
        for (int t : tracker) {
            max = Math.max(max, t);
        }

        return max;
    }

    public int minMeetingRoomsPQ(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {
            Interval curr = intervals[i];
            if (curr.start >= pq.peek()) {
                pq.remove();
            }
            pq.add(curr.end);
        }

        return pq.size();
    }
}

