package org.calvin.Sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class WiggleSortTest {
    private WiggleSort fixture;
    @BeforeEach
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