package org.calvin.GraphMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralGrid {
    static List<Integer> spiralPrint(int a[][]) {
        List<Integer> result = new ArrayList<>();
        int m = a.length;
        int n = a[0].length;
        int i, k = 0, l = 0;
        /*
            k - starting row index
            m - ending row index
            l - starting column index
            n - ending column index
            i - iterator
        */

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                result.add(a[k][i]);
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i) {
                result.add(a[i][n - 1]);
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    result.add(a[m - 1][i]);
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    result.add(a[i][l]);
                }
                l++;
            }
        }

        return result;
    }
}
