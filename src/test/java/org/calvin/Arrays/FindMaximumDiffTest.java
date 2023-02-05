package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaximumDiffTest {
    private FindMaximumDiff fixture;
    private static int[] input = {34, 8, 10, 3, 2, 80, 30, 33, 1};
    @BeforeEach
    public void setUp() {
        fixture = new FindMaximumDiff();
    }

    @Test
    public void maximumDiff() throws Exception {
        int result = fixture.maximumDiff(input);
        assertEquals(78, result);
    }

    @Test
    public void maximumDiffIndex() throws Exception {
        int index = fixture.maximumDiffIndex(input);
        assertEquals(6, index);
    }

    @Test
    public void maximumDiffIndexEfficient() throws Exception {
        int index = fixture.maximumDiffIndexEfficient(input);
        assertEquals(6, index);
    }

}