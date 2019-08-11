package org.calvin.GraphMatrix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumIslandsTest {

    private NumIslands fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new NumIslands();
    }

    @Test
    public void numIsland() {
        char[][] m = {{'0','0','0','x','0'},
                {'0','0','0','x','0'},
                {'0','0','0','x','0'},
                {'0','x','0','0','0'},
                {'0','0','0','0','0'}};
        System.out.println(fixture.numIsland(m));
    }
}