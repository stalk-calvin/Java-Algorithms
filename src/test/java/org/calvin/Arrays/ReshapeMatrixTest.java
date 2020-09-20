/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReshapeMatrixTest {
    private ReshapeMatrix fixture = new ReshapeMatrix();

    @Test public void matrixReshape() throws Exception {
        int[][] input = new int[3][2];
        input[0][0] = 1;
        input[0][1] = 2;
        input[1][0] = 3;
        input[1][1] = 4;
        input[2][0] = 5;
        input[2][1] = 6;

        int r = 2;
        int c = 3;
        int[][] expected = new int[r][c];
        expected[0][0] = input[0][0];
        expected[0][1] = input[0][1];
        expected[0][2] = input[1][0];
        expected[1][0] = input[1][1];
        expected[1][1] = input[2][0];
        expected[1][2] = input[2][1];

        assertArrayEquals(expected, fixture.matrixReshape(input,r,c));
    }

}
