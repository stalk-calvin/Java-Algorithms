package org.calvin.Arrays;

import java.util.Arrays;

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

    public int minMeetingRoomsMyway(Interval[] intervals) {
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
            for (int j = intervals[i].start; j <= intervals[i].end; j++) {
                tracker[j]++;
            }
        }

        max = Integer.MIN_VALUE;
        for (int t : tracker) {
            max = Math.max(max, t);
        }

        return max;
    }
}

