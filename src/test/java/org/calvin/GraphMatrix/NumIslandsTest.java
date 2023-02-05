package org.calvin.GraphMatrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumIslandsTest {

    private NumIslands fixture;

    @BeforeEach
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