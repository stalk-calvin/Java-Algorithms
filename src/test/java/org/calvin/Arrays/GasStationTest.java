package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GasStationTest {
    private GasStation fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new GasStation();
    }

    @Test
    public void shouldCompleteCircuit() throws Exception {
        int[] gas = {1,2,3,3};
        int[] cost = {2,1,5,1};
        int actual = fixture.canCompleteCircuit(gas,cost);
        assertEquals(3, actual);
    }

    @Test
    public void shouldNotCompleteCircuit() throws Exception {
        int[] gas = {1,2,3,3};
        int[] cost = {5,6,5,7};
        int actual = fixture.canCompleteCircuit(gas,cost);
        assertEquals(-1, actual);
    }

}