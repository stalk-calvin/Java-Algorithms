package org.calvin.Arrays;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HighestRAM {
    public static long findHighRAM(List<HighestRAM.LogEntry> logEntries) {
        long curRAM = 0, highRAM = 0;
        Map<Long, Long> times = new TreeMap<>();

        for (LogEntry entry : logEntries) {
            if (times.get(entry.startTime) != null) {
                long oldVal = times.get(entry.startTime);
                long newVal = oldVal + entry.ram;
                times.put(entry.startTime, newVal);
            } else {
                times.put(entry.startTime, entry.ram);
            }
            if (times.get(entry.endTime) != null) {
                long oldVal = times.get(entry.endTime);
                long newVal = oldVal - entry.ram;
                times.put(entry.endTime, newVal);
            } else {
                times.put(entry.endTime, -1 * entry.ram);
            }
        }

        for (Map.Entry<Long, Long> event : times.entrySet()) {
            curRAM += event.getValue();
            if (curRAM > highRAM) highRAM = curRAM;
        }

        return highRAM;
    }

    static class LogEntry {
        public final long startTime;
        public final long endTime;
        public final long ram;
        public final long jobId;

        public LogEntry(long sTime, long eTime, long ram, long id) {
            startTime = sTime;
            endTime = eTime;
            this.ram = ram;
            jobId = id;
        }
    }
}
