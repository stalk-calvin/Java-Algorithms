/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph.Dijkstra;

import java.util.Arrays;
import java.util.List;

// O(V^2)
public class Dijkstra {
    public static void shortestPaths(List<Edge>[] graph, int s, int[] prio, int[] pred) {
        int n = graph.length;
        Arrays.fill(pred, -1);
        Arrays.fill(prio, Integer.MAX_VALUE);
        prio[s] = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || prio[u] > prio[j]))
                    u = j;
            }
            if (prio[u] == Integer.MAX_VALUE)
                break;
            visited[u] = true;

            for (Edge e : graph[u]) {
                int v = e.getT();
                int nprio = prio[u] + e.getCost();
                if (prio[v] > nprio) {
                    prio[v] = nprio;
                    pred[v] = u;
                }
            }
        }
    }
}
