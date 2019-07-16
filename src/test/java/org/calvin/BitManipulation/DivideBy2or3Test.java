package org.calvin.BitManipulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideBy2or3Test {
    private DivideBy2or3 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new DivideBy2or3();
    }

    @Test
    public void shouldAdd() throws Exception {
        int expected = 14;
        assertEquals(expected, fixture.add(7,7));
    }

    @Test
    public void divideby2() throws Exception {
        assertEquals(150, fixture.divideby2or3(300,2));
    }

    @Test
    public void divideby3() throws Exception {
        assertEquals(100, fixture.divideby2or3(300,3));
    }

}