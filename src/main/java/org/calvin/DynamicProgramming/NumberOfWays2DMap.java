package org.calvin.DynamicProgramming;

public class NumberOfWays2DMap {
    public static int numberOfWays(int n, int m) {
        return computeNumberOfWaysToXY(n - 1, m - 1, new int[n][m]);
    }
    private static int computeNumberOfWaysToXY(int x, int y,
                                               int[][] numberOfWays) {
        if (x == 0 || y == 0) {
            return 1;
        }
        if (numberOfWays[x][y] == 0) {
            int waysTop = computeNumberOfWaysToXY(x - 1, y, numberOfWays);
            int waysLeft = computeNumberOfWaysToXY(x, y - 1, numberOfWays);
            numberOfWays[x][y] = waysTop + waysLeft;
        }
        return numberOfWays[x][y];
    }
}
