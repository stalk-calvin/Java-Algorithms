package org.calvin.GraphMatrix;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpiralGridTest {
    @Test
    public void shouldGetSpiralTraverse() {
        int[][] a = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11);
        List<Integer> actual = SpiralGrid.spiralPrint(a);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSpiralTraverseAnother() {
        int[][] a = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12);
        List<Integer> actual = SpiralGrid.spiralPrint(a);
        assertEquals(expected, actual);
    }
}