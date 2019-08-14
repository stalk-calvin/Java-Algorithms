package org.calvin.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.calvin.Arrays.HighestRAM.LogEntry;
import static org.junit.Assert.assertEquals;

public class HighestRAMTest {
    Map<Long, Long> tracker = new TreeMap<>();
    List<LogEntry> logEntries = new ArrayList<>();

    @Test
    public void shouldFindHighRAM() {
        logEntries.add(new LogEntry(1, 2, 1, 1));
        logEntries.add(new LogEntry(2, 4, 2, 2));
        logEntries.add(new LogEntry(3, 4, 3, 3));
        logEntries.add(new LogEntry(10, 15, 10, 3));
        long actual = HighestRAM.findHighRAM(logEntries, tracker);
        assertEquals(10, actual);
    }

    @Test
    public void shouldFindHigherRAM() {
        logEntries.add(new LogEntry(2, 4, 7,3));
        logEntries.add(new LogEntry(1, 2, 1, 1));
        logEntries.add(new LogEntry(2, 4, 2, 2));
        logEntries.add(new LogEntry(3, 4, 3, 3));
        logEntries.add(new LogEntry(10, 15, 10, 3));
        long actual = HighestRAM.findHighRAM(logEntries, tracker);
        assertEquals(12, actual);
    }
}