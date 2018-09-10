package org.calvin.GraphMatrix;

import java.util.LinkedList;
import java.util.Queue;

class Item {
    int row;
    int col;
    int dist;
    public Item (int x, int y, int z) {
        row = x;
        col = y;
        dist = z;
    }
}
public class TwoDMatrixBFS {
    public int minDistance(char[][] grid) {
        if (grid == null) {
            return -1;
        }
        Item source = new Item(0,0,0);
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
            {
                visited[i][j] = grid[i][j] == 'X';

                // Finding source
                if (grid[i][j] == 's')
                {
                    source.row = i;
                    source.col = j;
                }
            }
        }

        Queue<Item> tracker = new LinkedList<>();
        tracker.add(source);
        visited[source.row][source.col] = true;
        while(!tracker.isEmpty()) {
            Item p = tracker.poll();

            if (grid[p.row][p.col] == 'e') {
                return p.dist;
            }

            // moving up
            if (p.row - 1 >= 0 && !visited[p.row - 1][p.col]) {
                tracker.add(new Item(p.row - 1, p.col, p.dist + 1));
                visited[p.row - 1][p.col] = true;
            }

            // moving down
            if (p.row + 1 < n && !visited[p.row + 1][p.col]) {
                tracker.add(new Item(p.row + 1, p.col, p.dist + 1));
                visited[p.row + 1][p.col] = true;
            }

            // moving left
            if (p.col - 1 >= 0 && !visited[p.row][p.col - 1]) {
                tracker.add(new Item(p.row, p.col - 1, p.dist + 1));
                visited[p.row][p.col - 1] = true;
            }

            // moving right
            if (p.col + 1 < m && !visited[p.row][p.col + 1]) {
                tracker.add(new Item(p.row, p.col + 1, p.dist + 1));
                visited[p.row][p.col + 1] = true;
            }
        }

        //not found
        return -1;
    }
}
