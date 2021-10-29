package org.calvin.GraphMatrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class RottenOrangesTest {
    @Test
    public void shouldRotNearbyOranges() {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        assertEquals(4, RottenOranges.orangesRotting(grid));
    }

    @Test
    public void shouldNotRotAllOranges() {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        assertEquals(-1, RottenOranges.orangesRotting(grid));
    }
}