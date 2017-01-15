package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MostFrequentTest {
    private MostFrequent fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new MostFrequent();
    }

    @Test
    public void findFrequentInteger() throws Exception {
        int[] input = {1,2,3,5,24,1,5,2,1,3,2,1,1,9,7,1};
        int actual = fixture.findFrequentInteger(input);
        assertEquals(1, actual);
    }

}