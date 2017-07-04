/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int totalSize = nums.length * nums[0].length;
        if (totalSize < r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }
}
