/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph.Dijkstra;

import java.util.Arrays;
import java.util.List;

// O(V^2)
// Dijkstra's algorithm to find shortest path starting from 's'
public class Dijkstra {
    public static void shortestPaths(List<Edge>[] graph, int s, int[] distance, int[] pred) {
        int n = graph.length;
        Arrays.fill(pred, -1);
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[s] = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || distance[u] > distance[j]))
                    u = j;
            }
            if (distance[u] == Integer.MAX_VALUE)
                break;
            visited[u] = true;

            for (Edge e : graph[u]) {
                int v = e.t;
                int ndistance = distance[u] + e.cost;
                if (distance[v] > ndistance) {
                    distance[v] = ndistance;
                    pred[v] = u;
                }
            }
        }
    }
}
