package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestRecurringSubstrTest {
    private LongestRecurringSubstr fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new LongestRecurringSubstr();
    }

    @Test
    public void findLongestRecurringSubstr() throws Exception {
        String in="Hello, World!";
        String out = fixture.findLongestRecurringSubstr(in);
        String expected="l";
        assertTrue(expected.equals(out));
    }

    @Test
    public void findLongestRecurringSubstrLongerString() throws Exception {
        String in="peter piper picked a peck of pickled pepper pipes.";
        String out = fixture.findLongestRecurringSubstr(in);
        String expected="er pipe";
        assertTrue(expected.equals(out));
    }

    @Test
    public void findLongestRecurringSubstrCapital() throws Exception {
        String in="ATCGATCGA";
        String out = fixture.findLongestRecurringSubstr(in);
        String expected="atcga";
        assertTrue(expected.equals(out));
    }
}