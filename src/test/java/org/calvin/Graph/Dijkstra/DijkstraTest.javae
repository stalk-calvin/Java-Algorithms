/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph.Dijkstra;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class DijkstraTest {
    private static final int[][] cost = { { 0, 3, 2 }, { 0, 0, -2 }, { 0, 0, 0 } };
    private static final int n = cost.length;

    @SuppressWarnings("unchecked")
    private static final List<Edge>[] graph = (List<Edge>[]) Stream.generate(ArrayList::new).limit(n)
            .toArray(List[]::new);

    @Before
    public void setup() {
        createGraph();
    }

    @Test
    public void shouldGetShortestPaths() {
        int[] dist = new int[n];
        int[] pred = new int[n];
        Dijkstra.shortestPaths(graph, 0, dist, pred);
        assertTrue(0 == dist[0]);
        assertTrue(3 == dist[1]);
        assertTrue(1 == dist[2]);
        assertTrue(-1 == pred[0]);
        assertTrue(0 == pred[1]);
        assertTrue(1 == pred[2]);
    }

    private void createGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cost[i][j] != 0) {
                    graph[i].add(new Edge(j, cost[i][j]));
                }
            }
        }

    }

}