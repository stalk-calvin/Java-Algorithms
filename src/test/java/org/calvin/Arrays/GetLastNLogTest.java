package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetLastNLogTest {
    private GetLastNLog fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new GetLastNLog(10);
    }

    @Test
    public void shouldRecordAndGetLastElement() {
        fixture.record(1);
        fixture.record(2);
        fixture.record(3);
        fixture.record(4);
        fixture.record(5);
        fixture.record(6);
        fixture.record(7);
        fixture.record(8);
        fixture.record(9);
        fixture.record(10);
        assertEquals(10, fixture.getLast(1));
        assertEquals(6, fixture.getLast(5));
        assertEquals(1, fixture.getLast(10));
        fixture.record(18);
        fixture.record(19);
        fixture.record(100);
        assertEquals(100, fixture.getLast(1));
        assertEquals(9, fixture.getLast(5));
        assertEquals(4, fixture.getLast(10));
    }
}