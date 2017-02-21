/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers.Range;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RangeQueryTest {
    private RangeQuery fixture;

    @Before
    public void setUp() {
        fixture = new RangeQuery();
        fixture.set(7,10);
        fixture.set(6,12);
        fixture.set(1,20);
        fixture.set(101,200);
        fixture.set(101,201);
        fixture.set(101,202);
        fixture.set(200,300);
        fixture.set(11,18);
        fixture.set(5,10);
        fixture.set(300,310);
        fixture.set(320,330);
        fixture.set(340,350);
        fixture.set(0,5);
    }

    @Test
    public void shouldGetCorrectRange() {
        Range r = fixture.get(8);
        assertEquals(1, r.getStart());
        assertEquals(20, r.getEnd());
    }

    @Test
    public void shouldGetRangeLeft() {
        Range r = fixture.get(0);
        assertEquals(0, r.getStart());
        assertEquals(5, r.getEnd());
    }

    @Test
    public void shouldGetRangeRight() {
        Range r = fixture.get(350);
        assertEquals(340, r.getStart());
        assertEquals(350, r.getEnd());
    }

    @Test
    public void shouldNotGetRange() {
        Range r = fixture.get(400);
        assertEquals(null, r);
    }
}