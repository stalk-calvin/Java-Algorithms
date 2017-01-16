package org.calvin.Utils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class GCTestTest {
    private GCTest fixture;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new GCTest();
    }

    @Test
    public void shouldFailToAllocate() {
        exception.expectMessage("Java heap space");
        exception.expect(OutOfMemoryError.class);
        fixture.allocate();
    }

    @Test
    public void shouldAllocateWhenWeakReference() {
        byte[] actual = fixture.weakAllocate();
        assertEquals(null, actual);
    }

}