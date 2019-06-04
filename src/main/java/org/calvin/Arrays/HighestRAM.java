package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HighestRAM {
    private static List<LogEntry> logEntries = new ArrayList<>();
    private static Map<Long, Long> times = new TreeMap<>();

    public static void main(String[] args) {
        logEntries.add(new LogEntry(1, 2, 1, 1));
        logEntries.add(new LogEntry(2, 4, 2, 2));
        logEntries.add(new LogEntry(3, 4, 3, 3));
        logEntries.add(new LogEntry(10, 15, 10, 3));
//        logEntries.add(new LogEntry(110, 220, 400, 4));
//        logEntries.add(new LogEntry(175, 280, 750, 5));

        System.out.println("Highest RAM used is: " + findHighRAM());
    }

    private static long findHighRAM() {
        long curRAM = 0, highRAM = 0;

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
