package org.calvin.GraphMatrix;

public class NumIslands {
    public int numIsland(char[][] m) {
        int ret = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == 'x') {
                    if (dfsIslands(m, i, j)) {
                        ret++;
                    }
                }
            }
        }
        return ret;
    }

    private boolean dfsIslands(char[][] m, int r, int c) {
        m[r][c] = 'v';
        if (r > 0 && m[r - 1][c] == 'x') {
            return dfsIslands(m, r - 1, c);
        }
        if (r < m.length - 1 && m[r + 1][c] == 'x') {
            return dfsIslands(m, r + 1, c);
        }
        if (c > 0 && m[r][c - 1] == 'x') {
            return dfsIslands(m, r, c - 1);
        }
        if (c < m[r].length - 1 && m[r][c + 1] == 'x') {
            return dfsIslands(m, r, c + 1);
        }
        return true;
    }
}