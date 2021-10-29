package org.calvin.GraphMatrix;

import org.junit.Before;
import org.junit.Test;

public class NumIslandsTest {

    private NumIslands fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new NumIslands();
    }

    @Test
    public void numIsland() {
        char[][] m = {
                {'x','x','x'},
                {'0','x','0'},
                {'x','x','x'}
        };
        System.out.println(fixture.numIsland(m));
    }
}