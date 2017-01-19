/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

public class CountPrimesTest {
    private CountPrimes fixture;

    @Before
    public void setUp() {
        fixture = new CountPrimes();
    }

    @Test
    public void shouldGetPrimeUptoGivenNumber() {
        List<Integer> expected = Lists.newArrayList(2,3,5,7);
        List<Integer> actual = fixture.countPrimes(11);
        assertEquals(expected, actual);
        assertEquals(4, actual.size());
    }

}