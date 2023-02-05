package org.calvin.Arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.calvin.Arrays.HighestRAM.LogEntry;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestRAMTest {
    @Test
    public void shouldFindHighRAM() {
        List<LogEntry> logEntries = new ArrayList<>();
        logEntries.add(new LogEntry(1, 2, 1, 1));
        logEntries.add(new LogEntry(2, 4, 2, 2));
        logEntries.add(new LogEntry(3, 4, 3, 3));
        logEntries.add(new LogEntry(10, 15, 10, 3));
        long actual = HighestRAM.findHighRAM(logEntries);
        assertEquals(10, actual);
    }

    @Test
    public void shouldFindHigherRAM() {
        List<LogEntry> logEntries = new ArrayList<>();
        logEntries.add(new LogEntry(2, 4, 7,3));
        logEntries.add(new LogEntry(1, 2, 1, 1));
        logEntries.add(new LogEntry(2, 4, 2, 2));
        logEntries.add(new LogEntry(3, 4, 3, 3));
        logEntries.add(new LogEntry(10, 15, 10, 3));
        long actual = HighestRAM.findHighRAM(logEntries);
        assertEquals(12, actual);
    }
}