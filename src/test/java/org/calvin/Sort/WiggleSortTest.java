package org.calvin.Sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WiggleSortTest {
    private WiggleSort fixture;
    @Before
    public void setUp() throws Exception {
        fixture = new WiggleSort();
    }

    @Test
    public void shouldWiggleSort() throws Exception {
        int[] input = {3,5,2,1,6,4};
        int[] expected = {3,5,1,6,2,4};
        fixture.wiggleSort(input);
        assertTrue(Arrays.equals(expected,input));
    }

    @Test
    public void shouldWiggleSortAnotherMethod() throws Exception {
        int[] input = {3,5,2,1,6,4};
        int[] expected = {3,5,1,6,2,4};
        fixture.wiggleSortAnother(input);
        assertTrue(Arrays.equals(expected,input));
    }
}