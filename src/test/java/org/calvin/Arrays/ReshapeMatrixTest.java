/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReshapeMatrixTest {
    private ReshapeMatrix fixture = new ReshapeMatrix();
    @Test public void matrixReshape() throws Exception {
        int[][] input = new int[2][2];
        input[0][0] = 1;
        input[0][1] = 2;
        input[1][0] = 3;
        input[1][1] = 4;

        int r = 1;
        int c = 4;
        int[][] expected = new int[r][c];
        expected[0][0] = input[0][0];
        expected[0][1] = input[0][1];
        expected[0][2] = input[1][0];
        expected[0][3] = input[1][1];

        assertArrayEquals(expected, fixture.matrixReshape(input,1,4));
    }

}
